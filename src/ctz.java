public class ctz extends cum {
   public ctz(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      cmz $$1 = $$0.o();
      dca $$2 = $$0.q();
      iz $$3 = $$0.a();
      dse $$4 = $$2.a_($$3);
      if (!dfp.h($$4) && !dfq.g($$4) && !dfr.g($$4)) {
         iz $$5 = $$3.a($$0.k());
         if (deo.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awa.iZ, awb.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dse $$6 = deo.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dwx.i, $$3);
            cur $$7 = $$0.n();
            if ($$1 instanceof arg) {
               am.z.a((arg)$$1, $$5, $$7);
               $$7.a(1, $$1, btr.d($$0.p()));
            }

            return bqw.a($$2.x_());
         } else {
            return bqw.f;
         }
      } else {
         $$2.a($$1, $$3, awa.iZ, awb.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dsu.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dwx.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btr.d($$0.p()));
         }

         return bqw.a($$2.x_());
      }
   }
}
