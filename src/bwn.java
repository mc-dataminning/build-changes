public abstract class bwn extends bwh {
   protected static final float bY = 0.0F;

   protected bwn(bvq<? extends bwn> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public float c(jh $$0) {
      return this.a($$0, this.dW());
   }

   public float a(jh $$0, dhk $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dhi $$0, bvp $$1) {
      return this.a(this.dw(), $$0) >= 0.0F;
   }

   public boolean gk() {
      return !this.L().m();
   }

   public boolean gl() {
      if (this.bF.a(cfj.Z)) {
         return this.bF.c(cfj.Z).isPresent();
      } else {
         for (cer $$0 : this.bT.b()) {
            if ($$0.h() && $$0.k() instanceof cdw) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gm() {
      return true;
   }

   @Override
   public void a(bvj $$0) {
      super.a($$0);
      if (this.gm() && !this.gl()) {
         this.bT.b(cdd.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fbx $$3 = new fbx($$0.dB() - this.dB(), $$0.dD() - this.dD(), $$0.dH() - this.dH()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.L().a(this.dB() + $$3.d, this.dD() + $$3.e, this.dH() + $$3.f, this.gn());
      }
   }

   @Override
   public boolean a(bvj $$0, float $$1) {
      this.a($$0.dw(), 5);
      return true;
   }

   protected double gn() {
      return 1.0;
   }
}
