public class cvz extends cwl {
   public cvz(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dai $$0) {
      cox $$1 = $$0.o();
      dgi $$2 = $$0.q();
      ji $$3 = $$0.a();
      dwx $$4 = $$2.a_($$3);
      if (!dkb.i($$4) && !dkc.h($$4) && !dkd.h($$4)) {
         ji $$5 = $$3.a($$0.k());
         if (diz.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awa.jz, awb.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            dwx $$6 = diz.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ebt.i, $$3);
            cwp $$7 = $$0.n();
            if ($$1 instanceof are) {
               ap.z.a((are)$$1, $$5, $$7);
               $$7.a(1, $$1, bvh.d($$0.p()));
            }

            return bsk.a;
         } else {
            return bsk.d;
         }
      } else {
         $$2.a($$1, $$3, awa.jz, awb.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dxn.v, Boolean.valueOf(true)), 11);
         $$2.a($$1, ebt.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bvh.d($$0.p()));
         }

         return bsk.a;
      }
   }
}
