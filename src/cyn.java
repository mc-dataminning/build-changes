public class cyn extends cyz {
   public cyn(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      crc $$1 = $$0.o();
      dja $$2 = $$0.q();
      iu $$3 = $$0.a();
      eah $$4 = $$2.a_($$3);
      if (!dmv.i($$4) && !dmw.h($$4) && !dmx.h($$4)) {
         iu $$5 = $$3.a($$0.k());
         if (dls.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awn.jD, awo.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            eah $$6 = dls.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, efh.i, $$3);
            czd $$7 = $$0.n();
            if ($$1 instanceof arr) {
               ap.z.a((arr)$$1, $$5, $$7);
               $$7.a(1, $$1, bxe.d($$0.p()));
            }

            return bud.a;
         } else {
            return bud.d;
         }
      } else {
         $$2.a($$1, $$3, awn.jD, awo.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(eax.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, efh.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bxe.d($$0.p()));
         }

         return bud.a;
      }
   }
}
