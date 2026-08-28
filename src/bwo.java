public abstract class bwo extends bwi {
   protected static final float bY = 0.0F;

   protected bwo(bvr<? extends bwo> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public float c(jh $$0) {
      return this.a($$0, this.dW());
   }

   public float a(jh $$0, dhl $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dhj $$0, bvq $$1) {
      return this.a(this.dw(), $$0) >= 0.0F;
   }

   public boolean gk() {
      return !this.L().m();
   }

   public boolean gl() {
      if (this.bF.a(cfk.Z)) {
         return this.bF.c(cfk.Z).isPresent();
      } else {
         for (ces $$0 : this.bT.b()) {
            if ($$0.h() && $$0.k() instanceof cdx) {
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
   public void a(bvk $$0) {
      super.a($$0);
      if (this.gm() && !this.gl()) {
         this.bT.b(cde.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fby $$3 = new fby($$0.dB() - this.dB(), $$0.dD() - this.dD(), $$0.dH() - this.dH()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.L().a(this.dB() + $$3.d, this.dD() + $$3.e, this.dH() + $$3.f, this.gn());
      }
   }

   @Override
   public boolean a(bvk $$0, float $$1) {
      this.a($$0.dw(), 5);
      return true;
   }

   protected double gn() {
      return 1.0;
   }
}
