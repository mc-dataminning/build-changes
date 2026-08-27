public class cie extends cis {
   public cie(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(clh $$0) {
      cbm $$1 = $$0.o();
      cpl $$2 = $$0.q();
      gu $$3 = $$0.a();
      dez $$4 = $$2.a_($$3);
      if (!csy.h($$4) && !csz.g($$4) && !cta.g($$4)) {
         gu $$5 = $$3.a($$0.k());
         if (crz.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aow.hS, aox.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
            dez $$6 = crz.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, djj.i, $$3);
            cix $$7 = $$0.n();
            if ($$1 instanceof akl) {
               ai.y.a((akl)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bgq.a($$2.r_());
         } else {
            return bgq.e;
         }
      } else {
         $$2.a($$1, $$3, aow.hS, aox.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dfp.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, djj.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bgq.a($$2.r_());
      }
   }
}
