public class cuz extends cuk {
   private static final kt a = new ks() {
      private final ks c = new ks();

      @Override
      public cup a(kq $$0, cup $$1) {
         je $$2 = $$0.d().c(dhe.b);
         arf $$3 = $$0.b();
         evr $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         iz $$8 = $$0.c().a($$2);
         dsc $$9 = $$3.a_($$8);
         dtg $$10 = $$9.b() instanceof deo ? $$9.c(((deo)$$9.b()).c()) : dtg.a;
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

            dsc $$13 = $$3.a_($$8.d());
            dtg $$14 = $$13.b() instanceof deo ? $$13.c(((deo)$$13.b()).c()) : dtg.a;
            if ($$2 != je.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cot $$18 = cot.a($$3, $$5, $$6 + $$11, $$7, ((cuz)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kq $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cot.a b;

   public cuz(cot.a $$0, cuk.a $$1) {
      super($$1);
      this.b = $$0;
      dhe.a(this, a);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      if (!$$3.a(awp.N)) {
         return bqu.f;
      } else {
         cup $$4 = $$0.n();
         if ($$1 instanceof arf $$5) {
            dtg $$6 = $$3.b() instanceof deo ? $$3.c(((deo)$$3.b()).c()) : dtg.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cot $$8 = cot.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dwv.t, $$2, dwv.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqu.a($$1.B);
      }
   }
}
