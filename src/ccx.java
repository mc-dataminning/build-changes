public interface ccx {
   String c_ = "Inventory";

   bix y();

   static void a(bla $$0, ccx $$1, caf $$2) {
      clb $$3 = $$2.q();
      if ($$0.k($$3)) {
         bix $$4 = $$1.y();
         boolean $$5 = $$4.b($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         clb $$7 = $$4.a($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.b()) {
            $$2.ak();
         } else {
            $$3.f($$7.L());
         }
      }
   }

   default void c(rz $$0) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10));
      }
   }

   default void a_(rz $$0) {
      $$0.a("Inventory", this.y().g());
   }
}
