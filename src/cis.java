public class cis extends cjg {
   public cis(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cca $$1 = $$0.o();
      cqb $$2 = $$0.q();
      gw $$3 = $$0.a();
      dfd $$4 = $$2.a_($$3);
      if (!ctq.h($$4) && !ctr.g($$4) && !cts.g($$4)) {
         gw $$5 = $$3.a($$0.k());
         if (csp.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, apg.hS, aph.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
            dfd $$6 = csp.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, djn.i, $$3);
            cjl $$7 = $$0.n();
            if ($$1 instanceof aku) {
               al.y.a((aku)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bhe.a($$2.w_());
         } else {
            return bhe.e;
         }
      } else {
         $$2.a($$1, $$3, apg.hS, aph.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dft.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, djn.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bhe.a($$2.w_());
      }
   }
}
