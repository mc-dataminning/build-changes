public class cty extends cul {
   public cty(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      cmy $$1 = $$0.o();
      dbz $$2 = $$0.q();
      iz $$3 = $$0.a();
      dsd $$4 = $$2.a_($$3);
      if (!dfo.h($$4) && !dfp.g($$4) && !dfq.g($$4)) {
         iz $$5 = $$3.a($$0.k());
         if (den.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awa.iZ, awb.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dsd $$6 = den.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dww.i, $$3);
            cuq $$7 = $$0.n();
            if ($$1 instanceof arg) {
               am.z.a((arg)$$1, $$5, $$7);
               $$7.a(1, $$1, btq.d($$0.p()));
            }

            return bqv.a($$2.x_());
         } else {
            return bqv.f;
         }
      } else {
         $$2.a($$1, $$3, awa.iZ, awb.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dst.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dww.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btq.d($$0.p()));
         }

         return bqv.a($$2.x_());
      }
   }
}
