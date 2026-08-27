public interface cgs {
   String d_ = "Inventory";

   bmd A();

   static void a(boi $$0, cgs $$1, cds $$2) {
      coz $$3 = $$2.q();
      if ($$0.k($$3)) {
         bmd $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.M();
         coz $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.M());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.M());
         }
      }
   }

   default void c(sw $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(sw $$0) {
      $$0.a("Inventory", this.A().g());
   }
}
