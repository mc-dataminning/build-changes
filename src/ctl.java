public class ctl extends cty {
   public ctl(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      cml $$1 = $$0.o();
      dcg $$2 = $$0.q();
      ja $$3 = $$0.a();
      dsl $$4 = $$2.a_($$3);
      if (!dfw.h($$4) && !dfx.g($$4) && !dfy.g($$4)) {
         ja $$5 = $$3.a($$0.k());
         if (dev.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avh.iZ, avi.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dsl $$6 = dev.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dxh.i, $$3);
            cud $$7 = $$0.n();
            if ($$1 instanceof aqn) {
               am.z.a((aqn)$$1, $$5, $$7);
               $$7.a(1, $$1, btc.d($$0.p()));
            }

            return bqh.a($$2.x_());
         } else {
            return bqh.f;
         }
      } else {
         $$2.a($$1, $$3, avh.iZ, avi.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dtb.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dxh.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btc.d($$0.p()));
         }

         return bqh.a($$2.x_());
      }
   }
}
