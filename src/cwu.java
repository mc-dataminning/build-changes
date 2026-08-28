public class cwu extends cxg {
   public cwu(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      cps $$1 = $$0.o();
      dha $$2 = $$0.q();
      jh $$3 = $$0.a();
      dxn $$4 = $$2.a_($$3);
      if (!dkt.i($$4) && !dku.h($$4) && !dkv.h($$4)) {
         jh $$5 = $$3.a($$0.k());
         if (djr.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, axf.js, axg.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            dxn $$6 = djr.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ecj.i, $$3);
            cxk $$7 = $$0.n();
            if ($$1 instanceof asi) {
               ao.z.a((asi)$$1, $$5, $$7);
               $$7.a(1, $$1, bwb.d($$0.p()));
            }

            return bte.a;
         } else {
            return bte.d;
         }
      } else {
         $$2.a($$1, $$3, axf.js, axg.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dyd.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, ecj.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bwb.d($$0.p()));
         }

         return bte.a;
      }
   }
}
