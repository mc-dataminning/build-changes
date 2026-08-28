public interface cph {
   String c_ = "Inventory";

   btq t();

   static void a(ash $$0, bwi $$1, cph $$2, cmb $$3) {
      cxp $$4 = $$3.l();
      if ($$1.c($$0, $$4)) {
         btq $$5 = $$2.t();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.L();
         cxp $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.L());
         if ($$8.f()) {
            $$3.at();
         } else {
            $$4.e($$8.L());
         }
      }
   }

   default void a(ux $$0, js.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.t().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(ux $$0, js.a $$1) {
      $$0.a("Inventory", this.t().a($$1));
   }
}
