public class cjf extends cir {
   private static final ii a = new ih() {
      private final ih c = new ih();

      @Override
      public ciw a(gw $$0, ciw $$1) {
         hb $$2 = $$0.e().c(cul.a);
         cpk $$3 = $$0.g();
         double $$4 = $$0.a() + (double)$$2.j() * 1.125;
         double $$5 = Math.floor($$0.b()) + (double)$$2.k();
         double $$6 = $$0.c() + (double)$$2.l() * 1.125;
         gv $$7 = $$0.d().a($$2);
         dey $$8 = $$3.a_($$7);
         dgc $$9 = $$8.b() instanceof csa ? $$8.c(((csa)$$8.b()).b()) : dgc.a;
         double $$10;
         if ($$8.a(apj.N)) {
            if ($$9.b()) {
               $$10 = 0.6;
            } else {
               $$10 = 0.1;
            }
         } else {
            if (!$$8.i() || !$$3.a_($$7.d()).a(apj.N)) {
               return this.c.dispense($$0, $$1);
            }

            dey $$12 = $$3.a_($$7.d());
            dgc $$13 = $$12.b() instanceof csa ? $$12.c(((csa)$$12.b()).b()) : dgc.a;
            if ($$2 != hb.a && $$13.b()) {
               $$10 = -0.4;
            } else {
               $$10 = -0.9;
            }
         }

         cdc $$17 = cdc.a($$3, $$4, $$5 + $$10, $$6, ((cjf)$$1.d()).b);
         if ($$1.A()) {
            $$17.b($$1.y());
         }

         $$3.b($$17);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(gw $$0) {
         $$0.g().c(1000, $$0.d(), 0);
      }
   };
   final cdc.a b;

   public cjf(cdc.a $$0, cir.a $$1) {
      super($$1);
      this.b = $$0;
      cul.a(this, a);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if (!$$3.a(apj.N)) {
         return bgo.e;
      } else {
         ciw $$4 = $$0.n();
         if (!$$1.B) {
            dgc $$5 = $$3.b() instanceof csa ? $$3.c(((csa)$$3.b()).b()) : dgc.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            cdc $$7 = cdc.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
               $$7.b($$4.y());
            }

            $$1.b($$7);
            $$1.a(dji.t, $$2, dji.a.a($$0.o(), $$1.a_($$2.d())));
         }

         $$4.h(1);
         return bgo.a($$1.B);
      }
   }
}
