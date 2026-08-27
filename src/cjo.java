public class cjo extends cja {
   private static final ij a = new ii() {
      private final ii c = new ii();

      @Override
      public cjf a(gx $$0, cjf $$1) {
         hc $$2 = $$0.e().c(cuw.a);
         cpv $$3 = $$0.g();
         double $$4 = $$0.a() + (double)$$2.j() * 1.125;
         double $$5 = Math.floor($$0.b()) + (double)$$2.k();
         double $$6 = $$0.c() + (double)$$2.l() * 1.125;
         gw $$7 = $$0.d().a($$2);
         dfj $$8 = $$3.a_($$7);
         dgn $$9 = $$8.b() instanceof csl ? $$8.c(((csl)$$8.b()).b()) : dgn.a;
         double $$10;
         if ($$8.a(apt.N)) {
            if ($$9.b()) {
               $$10 = 0.6;
            } else {
               $$10 = 0.1;
            }
         } else {
            if (!$$8.i() || !$$3.a_($$7.d()).a(apt.N)) {
               return this.c.dispense($$0, $$1);
            }

            dfj $$12 = $$3.a_($$7.d());
            dgn $$13 = $$12.b() instanceof csl ? $$12.c(((csl)$$12.b()).b()) : dgn.a;
            if ($$2 != hc.a && $$13.b()) {
               $$10 = -0.4;
            } else {
               $$10 = -0.9;
            }
         }

         cdl $$17 = cdl.a($$3, $$4, $$5 + $$10, $$6, ((cjo)$$1.d()).b);
         if ($$1.A()) {
            $$17.b($$1.y());
         }

         $$3.b($$17);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(gx $$0) {
         $$0.g().c(1000, $$0.d(), 0);
      }
   };
   final cdl.a b;

   public cjo(cdl.a $$0, cja.a $$1) {
      super($$1);
      this.b = $$0;
      cuw.a(this, a);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if (!$$3.a(apt.N)) {
         return bgy.e;
      } else {
         cjf $$4 = $$0.n();
         if (!$$1.B) {
            dgn $$5 = $$3.b() instanceof csl ? $$3.c(((csl)$$3.b()).b()) : dgn.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            cdl $$7 = cdl.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
               $$7.b($$4.y());
            }

            $$1.b($$7);
            $$1.a(djt.t, $$2, djt.a.a($$0.o(), $$1.a_($$2.d())));
         }

         $$4.h(1);
         return bgy.a($$1.B);
      }
   }
}
