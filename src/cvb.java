public class cvb extends cum {
   private static final kt a = new ks() {
      private final ks c = new ks();

      @Override
      public cur a(kq $$0, cur $$1) {
         je $$2 = $$0.d().c(dhg.b);
         arf $$3 = $$0.b();
         evt $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         iz $$8 = $$0.c().a($$2);
         dse $$9 = $$3.a_($$8);
         dti $$10 = $$9.b() instanceof deq ? $$9.c(((deq)$$9.b()).c()) : dti.a;
         double $$11;
         if ($$9.a(awp.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(awp.N)) {
               return this.c.dispense($$0, $$1);
            }

            dse $$13 = $$3.a_($$8.d());
            dti $$14 = $$13.b() instanceof deq ? $$13.c(((deq)$$13.b()).c()) : dti.a;
            if ($$2 != je.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cov $$18 = cov.a($$3, $$5, $$6 + $$11, $$7, ((cvb)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kq $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cov.a b;

   public cvb(cov.a $$0, cum.a $$1) {
      super($$1);
      this.b = $$0;
      dhg.a(this, a);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      if (!$$3.a(awp.N)) {
         return bqw.f;
      } else {
         cur $$4 = $$0.n();
         if ($$1 instanceof arf $$5) {
            dti $$6 = $$3.b() instanceof deq ? $$3.c(((deq)$$3.b()).c()) : dti.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cov $$8 = cov.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dwx.t, $$2, dwx.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqw.a($$1.B);
      }
   }
}
