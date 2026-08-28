public abstract class bxr extends bxl {
   protected static final float bF = 0.0F;

   protected bxr(bwr<? extends bxr> $$0, djh $$1) {
      super($$0, $$1);
   }

   public float c(iv $$0) {
      return this.a($$0, this.dU());
   }

   public float a(iv $$0, djk $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dji $$0, bwq $$1) {
      return this.a(this.du(), $$0) >= 0.0F;
   }

   public boolean gp() {
      return !this.O().k();
   }

   public boolean gq() {
      if (this.bs.a(cgl.aa)) {
         return this.bs.c(cgl.aa).isPresent();
      } else {
         for (cft $$0 : this.bD.b()) {
            if ($$0.h() && $$0.k() instanceof cey) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gr() {
      return true;
   }

   @Override
   public void a(bwi $$0) {
      super.a($$0);
      if (this.gr() && !this.gq()) {
         this.bD.b(cef.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fex $$3 = new fex($$0.dz() - this.dz(), $$0.dB() - this.dB(), $$0.dF() - this.dF()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.O().a(this.dz() + $$3.d, this.dB() + $$3.e, this.dF() + $$3.f, this.gs());
      }
   }

   @Override
   public boolean a(bwi $$0, float $$1) {
      this.a($$0.du(), 5);
      return true;
   }

   protected double gs() {
      return 1.0;
   }
}
