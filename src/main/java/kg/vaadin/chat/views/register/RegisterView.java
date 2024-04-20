package kg.vaadin.chat.views.register;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import kg.vaadin.chat.views.MainLayout;

@PageTitle("Register")
@Route(value = "register", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class RegisterView extends Composite<VerticalLayout> {

    public RegisterView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        TextField textField = new TextField();
        FormLayout formLayout2Col = new FormLayout();
        PasswordField passwordField = new PasswordField();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        RouterLink routerLink = new RouterLink();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Register");
        h3.setWidth("100%");
        textField.setLabel("Email");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.START, textField);
        textField.setWidth("366px");
        formLayout2Col.setWidth("100%");
        passwordField.setLabel("Password");
        passwordField.setWidth("min-content");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Register");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        routerLink.setText("Already logged in ?");
        routerLink.setRoute(CustomView.class);
        layoutRow.setAlignSelf(FlexComponent.Alignment.END, routerLink);
        routerLink.setWidth("662px");
        routerLink.setHeight("60px");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(textField);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(passwordField);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(routerLink);
    }
}
