public interface cnr {
   String e_ = "Inventory";

   bsf y();

   static void a(bux $$0, cnr $$1, ckq $$2) {
      cvx $$3 = $$2.m();
      if ($$0.i($$3)) {
         bsf $$4 = $$1.y();
         boolean $$5 = $$4.c($$3);
         if (!$$5) {
            return;
         }

         $$0.a($$2);
         int $$6 = $$3.L();
         cvx $$7 = $$4.b($$3);
         $$0.a($$2, $$6 - $$7.L());
         if ($$7.f()) {
            $$2.au();
         } else {
            $$3.e($$7.L());
         }
      }
   }

   default void a(uj $$0, jr.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.y().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(uj $$0, jr.a $$1) {
      $$0.a("Inventory", this.y().a($$1));
   }
}
