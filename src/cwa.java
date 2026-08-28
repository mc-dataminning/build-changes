public class cwa extends cwm {
   public cwa(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      coy $$1 = $$0.o();
      dgj $$2 = $$0.q();
      ji $$3 = $$0.a();
      dwy $$4 = $$2.a_($$3);
      if (!dkc.i($$4) && !dkd.h($$4) && !dke.h($$4)) {
         ji $$5 = $$3.a($$0.k());
         if (dja.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awa.jz, awb.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            dwy $$6 = dja.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ebu.i, $$3);
            cwq $$7 = $$0.n();
            if ($$1 instanceof are) {
               ap.z.a((are)$$1, $$5, $$7);
               $$7.a(1, $$1, bvi.d($$0.p()));
            }

            return bsl.a;
         } else {
            return bsl.d;
         }
      } else {
         $$2.a($$1, $$3, awa.jz, awb.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dxo.v, Boolean.valueOf(true)), 11);
         $$2.a($$1, ebu.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bvi.d($$0.p()));
         }

         return bsl.a;
      }
   }
}
