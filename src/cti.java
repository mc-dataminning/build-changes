public class cti extends ctv {
   public cti(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      cmh $$1 = $$0.o();
      dcd $$2 = $$0.q();
      ja $$3 = $$0.a();
      dsh $$4 = $$2.a_($$3);
      if (!dft.h($$4) && !dfu.g($$4) && !dfv.g($$4)) {
         ja $$5 = $$3.a($$0.k());
         if (des.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avf.iZ, avg.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dsh $$6 = des.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dxa.i, $$3);
            cua $$7 = $$0.n();
            if ($$1 instanceof aql) {
               am.z.a((aql)$$1, $$5, $$7);
               $$7.a(1, $$1, bsy.d($$0.p()));
            }

            return bqd.a($$2.x_());
         } else {
            return bqd.f;
         }
      } else {
         $$2.a($$1, $$3, avf.iZ, avg.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dsx.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dxa.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bsy.d($$0.p()));
         }

         return bqd.a($$2.x_());
      }
   }
}
