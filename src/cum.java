public class cum extends cuc {
   public cum(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      cmq $$4 = $$1.cK;
      if ($$4 != null) {
         a($$0, $$1, $$4);
      } else {
         if (!$$0.C) {
            $$3.a(1, $$1, bso.d($$2));
         }

         this.a($$0, $$1);
      }

      return bqb.a($$3, $$0.C);
   }

   private void a(dca $$0, cly $$1) {
      if (!$$0.C) {
         $$0.b(new cmq($$0, $$1));
      }

      $$1.b(avz.c.b(this));
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.jl, avq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      $$1.a(dxv.D);
   }

   private static void a(dca $$0, cly $$1, cmq $$2) {
      if (!$$0.x_()) {
         $$2.ao();
         $$1.cK = null;
      }

      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.jj, avq.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      $$1.a(dxv.C);
   }
}
