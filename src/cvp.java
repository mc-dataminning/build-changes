public class cvp extends cwb {
   public cvp(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      cor $$1 = $$0.o();
      dff $$2 = $$0.q();
      jh $$3 = $$0.a();
      dvo $$4 = $$2.a_($$3);
      if (!dix.i($$4) && !diy.h($$4) && !diz.h($$4)) {
         jh $$5 = $$3.a($$0.k());
         if (dhw.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awo.ja, awp.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dvo $$6 = dhw.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, eak.i, $$3);
            cwf $$7 = $$0.n();
            if ($$1 instanceof arr) {
               ao.z.a((arr)$$1, $$5, $$7);
               $$7.a(1, $$1, bve.d($$0.p()));
            }

            return bsh.a;
         } else {
            return bsh.d;
         }
      } else {
         $$2.a($$1, $$3, awo.ja, awp.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dwe.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, eak.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bve.d($$0.p()));
         }

         return bsh.a;
      }
   }
}
