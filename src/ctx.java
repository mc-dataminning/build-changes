public class ctx extends cuk {
   public ctx(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      cmx $$1 = $$0.o();
      dby $$2 = $$0.q();
      iz $$3 = $$0.a();
      dsc $$4 = $$2.a_($$3);
      if (!dfn.h($$4) && !dfo.g($$4) && !dfp.g($$4)) {
         iz $$5 = $$3.a($$0.k());
         if (dem.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awa.iZ, awb.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dsc $$6 = dem.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dwv.i, $$3);
            cup $$7 = $$0.n();
            if ($$1 instanceof arg) {
               am.z.a((arg)$$1, $$5, $$7);
               $$7.a(1, $$1, btp.d($$0.p()));
            }

            return bqu.a($$2.x_());
         } else {
            return bqu.f;
         }
      } else {
         $$2.a($$1, $$3, awa.iZ, awb.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dss.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dwv.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btp.d($$0.p()));
         }

         return bqu.a($$2.x_());
      }
   }
}
