public class cvz extends cwm {
   public cvz(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      if ($$1.cw != null) {
         if (!$$0.C) {
            int $$4 = $$1.cw.a($$3);
            $$3.a($$4, $$1, bvi.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jw, awb.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.a(ebu.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jy, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof ard $$5) {
            int $$6 = (int)(ddc.b($$5, $$3, $$1) * 20.0F);
            int $$7 = ddc.a($$5, $$3, $$1);
            cpr.a(new cpn($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awk.c.b(this));
         $$1.a(ebu.D);
      }

      return bsl.a;
   }
}
