public class cvw extends cwi {
   public cvw(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      cou $$1 = $$0.o();
      dfm $$2 = $$0.q();
      jh $$3 = $$0.a();
      dvv $$4 = $$2.a_($$3);
      if (!dje.i($$4) && !djf.h($$4) && !djg.h($$4)) {
         jh $$5 = $$3.a($$0.k());
         if (did.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awn.ja, awo.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
            dvv $$6 = did.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ear.i, $$3);
            cwm $$7 = $$0.n();
            if ($$1 instanceof arq) {
               ao.z.a((arq)$$1, $$5, $$7);
               $$7.a(1, $$1, bvh.d($$0.p()));
            }

            return bsk.a;
         } else {
            return bsk.d;
         }
      } else {
         $$2.a($$1, $$3, awn.ja, awo.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dwl.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, ear.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bvh.d($$0.p()));
         }

         return bsk.a;
      }
   }
}
