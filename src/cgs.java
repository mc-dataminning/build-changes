public class cgs extends cgo {
   public cgs(bmc<? extends cgs> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgs(ctx $$0, bmo $$1) {
      super(bmc.K, $$1, $$0);
   }

   public cgs(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.K, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cnb s() {
      return cnj.tU;
   }

   @Override
   protected float x() {
      return 0.07F;
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      if (this.dL() instanceof ane) {
         this.dL().c(2002, this.dl(), cpg.a(cph.c));
         int $$1 = 3 + this.dL().z.a(5) + this.dL().z.a(5);
         bme.a((ane)this.dL(), this.dj(), $$1);
         this.am();
      }
   }
}
