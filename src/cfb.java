public interface cfb {
   String d_ = "Inventory";

   bkl A();

   static void a(bmq $$0, cfb $$1, ccb $$2) {
      cng $$3 = $$2.q();
      if ($$0.k($$3)) {
         bkl $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cng $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(so $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(so $$0) {
      $$0.a("Inventory", this.A().g());
   }
}
