public class csh extends csu {
   public csh(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      clh $$1 = $$0.o();
      dad $$2 = $$0.q();
      in $$3 = $$0.a();
      dqh $$4 = $$2.a_($$3);
      if (!dds.h($$4) && !ddt.g($$4) && !ddu.g($$4)) {
         in $$5 = $$3.a($$0.k());
         if (dcr.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avc.iU, avd.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dqh $$6 = dcr.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dva.i, $$3);
            csz $$7 = $$0.n();
            if ($$1 instanceof aqi) {
               am.z.a((aqi)$$1, $$5, $$7);
               $$7.a(1, $$1, bsa.d($$0.p()));
            }

            return bpm.a($$2.x_());
         } else {
            return bpm.e;
         }
      } else {
         $$2.a($$1, $$3, avc.iU, avd.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dqx.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dva.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bsa.d($$0.p()));
         }

         return bpm.a($$2.x_());
      }
   }
}
