public interface cdk {
   String c_ = "Inventory";

   bjj A();

   static void a(bln $$0, cdk $$1, cas $$2) {
      clo $$3 = $$2.q();
      if ($$0.k($$3)) {
         bjj $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         clo $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(sd $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(sd $$0) {
      $$0.a("Inventory", this.A().g());
   }
}
