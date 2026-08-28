public class cvx extends cwj {
   public cvx(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      cov $$1 = $$0.o();
      dgg $$2 = $$0.q();
      ji $$3 = $$0.a();
      dwv $$4 = $$2.a_($$3);
      if (!djz.i($$4) && !dka.h($$4) && !dkb.h($$4)) {
         ji $$5 = $$3.a($$0.k());
         if (dix.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avz.jz, awa.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            dwv $$6 = dix.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ebr.i, $$3);
            cwn $$7 = $$0.n();
            if ($$1 instanceof ard) {
               ap.z.a((ard)$$1, $$5, $$7);
               $$7.a(1, $$1, bvf.d($$0.p()));
            }

            return bsi.a;
         } else {
            return bsi.d;
         }
      } else {
         $$2.a($$1, $$3, avz.jz, awa.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dxl.v, Boolean.valueOf(true)), 11);
         $$2.a($$1, ebr.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bvf.d($$0.p()));
         }

         return bsi.a;
      }
   }
}
