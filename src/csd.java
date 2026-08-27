public class csd extends csu {
   public csd(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dds.h($$3) && !ddt.g($$3) && !ddu.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dcr.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dcr.a($$1, $$2));
            $$1.a($$0.o(), dva.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dqx.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dva.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bpm.a($$1.B);
      } else {
         return bpm.e;
      }
   }

   private void a(dad $$0, in $$1) {
      ayg $$2 = $$0.E_();
      $$0.a(null, $$1, avc.iF, avd.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
