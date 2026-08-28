public class cuy extends cuj {
   private static final kt a = new ks() {
      private final ks c = new ks();

      @Override
      public cuo a(kq $$0, cuo $$1) {
         je $$2 = $$0.d().c(dhd.b);
         are $$3 = $$0.b();
         evq $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         iz $$8 = $$0.c().a($$2);
         dsb $$9 = $$3.a_($$8);
         dtf $$10 = $$9.b() instanceof den ? $$9.c(((den)$$9.b()).c()) : dtf.a;
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

            dsb $$13 = $$3.a_($$8.d());
            dtf $$14 = $$13.b() instanceof den ? $$13.c(((den)$$13.b()).c()) : dtf.a;
            if ($$2 != je.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cos $$18 = cos.a($$3, $$5, $$6 + $$11, $$7, ((cuy)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kq $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cos.a b;

   public cuy(cos.a $$0, cuj.a $$1) {
      super($$1);
      this.b = $$0;
      dhd.a(this, a);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      if (!$$3.a(awo.N)) {
         return bqt.f;
      } else {
         cuo $$4 = $$0.n();
         if ($$1 instanceof are $$5) {
            dtf $$6 = $$3.b() instanceof den ? $$3.c(((den)$$3.b()).c()) : dtf.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cos $$8 = cos.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dwu.t, $$2, dwu.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqt.a($$1.B);
      }
   }
}
