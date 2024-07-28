package ru.netology.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.channels.ConnectionPendingException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutoTest {

    @BeforeEach
    void setup() {
        open("http://localhost:9999/");
    }

    @Test
    @DisplayName("Should successfully login with active registered user")
    void shouldSuccessfullyLoginWithActiveRegisteredUser(){}
    //    var registeredUser = getRegisteredUser("active");
    //    $("[data-test-id='login'] input").setValue(registeredUser.getLogin());
    //    $("[data-test-id='password'] input").setValue(registeredUser.getPassword());
    //}


}
