public class cly extends cmm {
   public cly(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cfb $$1 = $$0.o();
      cti $$2 = $$0.q();
      hx $$3 = $$0.a();
      dja $$4 = $$2.a_($$3);
      if (!cwx.h($$4) && !cwy.g($$4) && !cwz.g($$4)) {
         hx $$5 = $$3.a($$0.k());
         if (cvw.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, arm.iv, arn.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            dja $$6 = cvw.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dnk.i, $$3);
            cmr $$7 = $$0.n();
            if ($$1 instanceof ana) {
               am.z.a((ana)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bjv.a($$2.y_());
         } else {
            return bjv.e;
         }
      } else {
         $$2.a($$1, $$3, arm.iv, arn.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(djq.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dnk.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bjv.a($$2.y_());
      }
   }
}
