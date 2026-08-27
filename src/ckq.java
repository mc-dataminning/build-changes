public class ckq extends cle {
   public ckq(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      cdu $$1 = $$0.o();
      csa $$2 = $$0.q();
      ht $$3 = $$0.a();
      dhi $$4 = $$2.a_($$3);
      if (!cvo.h($$4) && !cvp.g($$4) && !cvq.g($$4)) {
         ht $$5 = $$3.a($$0.k());
         if (cun.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aqr.im, aqs.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dhi $$6 = cun.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dls.i, $$3);
            clj $$7 = $$0.n();
            if ($$1 instanceof amf) {
               al.y.a((amf)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bix.a($$2.x_());
         } else {
            return bix.e;
         }
      } else {
         $$2.a($$1, $$3, aqr.im, aqs.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dhy.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dls.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bix.a($$2.x_());
      }
   }
}
