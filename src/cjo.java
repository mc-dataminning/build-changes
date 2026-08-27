public class cjo extends cja {
   private static final ih a = new ig() {
      private final ig c = new ig();

      @Override
      public cjf a(id $$0, cjf $$1) {
         ha $$2 = $$0.d().c(cuw.a);
         cpv $$3 = $$0.b();
         ehn $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         gw $$8 = $$0.c().a($$2);
         dfj $$9 = $$3.a_($$8);
         dgn $$10 = $$9.b() instanceof csl ? $$9.c(((csl)$$9.b()).b()) : dgn.a;
         double $$11;
         if ($$9.a(aps.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(aps.N)) {
               return this.c.dispense($$0, $$1);
            }

            dfj $$13 = $$3.a_($$8.d());
            dgn $$14 = $$13.b() instanceof csl ? $$13.c(((csl)$$13.b()).b()) : dgn.a;
            if ($$2 != ha.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cdl $$18 = cdl.a($$3, $$5, $$6 + $$11, $$7, ((cjo)$$1.d()).b);
         if ($$1.A()) {
            $$18.b($$1.y());
         }

         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(id $$0) {
         $$0.b().c(1000, $$0.c(), 0);
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
      if (!$$3.a(aps.N)) {
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
