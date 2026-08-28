public class dap extends czg implements dae {
   public static float a = 1.5F;

   public dap(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.zE, awo.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arq $$4) {
         cse.a(csj::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bug.a;
   }

   @Override
   public cse a(djh $$0, jp $$1, czk $$2, jb $$3) {
      return new csj($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
