public interface cec {
   String c_ = "Inventory";

   bjt A();

   static void a(blx $$0, cec $$1, cbe $$2) {
      cmh $$3 = $$2.q();
      if ($$0.k($$3)) {
         bjt $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cmh $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(sj $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(sj $$0) {
      $$0.a("Inventory", this.A().g());
   }
}
