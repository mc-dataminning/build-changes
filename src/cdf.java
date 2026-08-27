public interface cdf {
   String c_ = "Inventory";

   bje A();

   static void a(bli $$0, cdf $$1, can $$2) {
      clj $$3 = $$2.q();
      if ($$0.k($$3)) {
         bje $$4 = $$1.A();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         clj $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.am();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(rz $$0) {
      if ($$0.b("Inventory", 9)) {
         this.A().a($$0.c("Inventory", 10));
      }
   }

   default void a_(rz $$0) {
      $$0.a("Inventory", this.A().g());
   }
}
