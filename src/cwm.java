public class cwm extends cuc {
   private static final int a = 10;

   public cwm(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      if (!$$0.x_()) {
         ewu $$3 = $$1.bC().e($$1.bS().a(0.8F));
         if (!$$0.a_(ir.a($$3)).r()) {
            $$3 = $$1.bC().e($$1.bS().a(0.05F));
         }

         cnl $$4 = new cnl($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dM(), $$1.dK(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.CL, avq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      cuh $$5 = $$1.b($$2);
      $$1.gI().a(this, 10);
      $$1.b(avz.c.b(this));
      $$5.a(1, $$1);
      return bqb.a($$5, $$0.x_());
   }
}
