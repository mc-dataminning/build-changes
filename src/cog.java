public interface cog {
   String c_ = "Inventory";

   bsq t();

   static void a(arc $$0, bvi $$1, cog $$2, clb $$3) {
      cwp $$4 = $$3.l();
      if ($$1.c($$0, $$4)) {
         bsq $$5 = $$2.t();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.M();
         cwp $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.M());
         if ($$8.f()) {
            $$3.at();
         } else {
            $$4.e($$8.M());
         }
      }
   }

   default void a(tq $$0, jt.a $$1) {
      if ($$0.b("Inventory", 9)) {
         this.t().a($$0.c("Inventory", 10), $$1);
      }
   }

   default void b(tq $$0, jt.a $$1) {
      $$0.a("Inventory", this.t().a($$1));
   }
}
