public class cux extends cui {
   private static final kt a = new ks() {
      private final ks c = new ks();

      @Override
      public cun a(kq $$0, cun $$1) {
         je $$2 = $$0.d().c(dhc.b);
         are $$3 = $$0.b();
         evp $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         iz $$8 = $$0.c().a($$2);
         dsa $$9 = $$3.a_($$8);
         dte $$10 = $$9.b() instanceof dem ? $$9.c(((dem)$$9.b()).c()) : dte.a;
         double $$11;
         if ($$9.a(awo.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(awo.N)) {
               return this.c.dispense($$0, $$1);
            }

            dsa $$13 = $$3.a_($$8.d());
            dte $$14 = $$13.b() instanceof dem ? $$13.c(((dem)$$13.b()).c()) : dte.a;
            if ($$2 != je.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cor $$18 = cor.a($$3, $$5, $$6 + $$11, $$7, ((cux)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kq $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cor.a b;

   public cux(cor.a $$0, cui.a $$1) {
      super($$1);
      this.b = $$0;
      dhc.a(this, a);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      if (!$$3.a(awo.N)) {
         return bqs.f;
      } else {
         cun $$4 = $$0.n();
         if ($$1 instanceof are $$5) {
            dte $$6 = $$3.b() instanceof dem ? $$3.c(((dem)$$3.b()).c()) : dte.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cor $$8 = cor.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dwt.t, $$2, dwt.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqs.a($$1.B);
      }
   }
}
