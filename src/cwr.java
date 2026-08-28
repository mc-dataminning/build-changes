public class cwr extends cxd {
   public cwr(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      cpr $$1 = $$0.o();
      dgz $$2 = $$0.q();
      ji $$3 = $$0.a();
      dxq $$4 = $$2.a_($$3);
      if (!dkt.i($$4) && !dku.h($$4) && !dkv.h($$4)) {
         ji $$5 = $$3.a($$0.k());
         if (djr.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awa.jz, awb.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            dxq $$6 = djr.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ecp.i, $$3);
            cxh $$7 = $$0.n();
            if ($$1 instanceof are) {
               ap.z.a((are)$$1, $$5, $$7);
               $$7.a(1, $$1, bvy.d($$0.p()));
            }

            return bsy.a;
         } else {
            return bsy.d;
         }
      } else {
         $$2.a($$1, $$3, awa.jz, awb.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dyg.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, ecp.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bvy.d($$0.p()));
         }

         return bsy.a;
      }
   }
}
