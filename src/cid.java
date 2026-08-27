public class cid extends cir {
   public cid(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cbl $$1 = $$0.o();
      cpk $$2 = $$0.q();
      gv $$3 = $$0.a();
      dey $$4 = $$2.a_($$3);
      if (!csx.h($$4) && !csy.g($$4) && !csz.g($$4)) {
         gv $$5 = $$3.a($$0.k());
         if (cry.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aou.hS, aov.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
            dey $$6 = cry.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dji.i, $$3);
            ciw $$7 = $$0.n();
            if ($$1 instanceof akj) {
               ai.y.a((akj)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bgo.a($$2.r_());
         } else {
            return bgo.e;
         }
      } else {
         $$2.a($$1, $$3, aou.hS, aov.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dfo.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dji.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bgo.a($$2.r_());
      }
   }
}
