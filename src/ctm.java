public class ctm extends cuc {
   public ctm(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      if ($$1.cJ != null) {
         if (!$$0.C) {
            int $$4 = $$1.cJ.a($$3);
            $$3.a($$4, $$1, bso.d($$2));
         }

         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.jj, avq.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.a(dxv.C);
      } else {
         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.jl, avq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.C) {
            int $$5 = dae.e($$3);
            int $$6 = dae.d($$3);
            $$0.b(new cmn($$1, $$0, $$6, $$5));
         }

         $$1.b(avz.c.b(this));
         $$1.a(dxv.D);
      }

      return bqb.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
