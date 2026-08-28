public abstract class bwj extends bwd {
   protected static final float bY = 0.0F;

   protected bwj(bvm<? extends bwj> $$0, dha $$1) {
      super($$0, $$1);
   }

   public float c(jh $$0) {
      return this.a($$0, this.dV());
   }

   public float a(jh $$0, dhd $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dhb $$0, bvl $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean gi() {
      return !this.L().m();
   }

   public boolean gj() {
      if (this.bF.a(cff.Z)) {
         return this.bF.c(cff.Z).isPresent();
      } else {
         for (cen $$0 : this.bT.b()) {
            if ($$0.h() && $$0.k() instanceof cds) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gk() {
      return true;
   }

   @Override
   public void a(bvf $$0) {
      super.a($$0);
      if (this.gk() && !this.gj()) {
         this.bT.b(ccz.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fbs $$3 = new fbs($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.L().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gl());
      }
   }

   @Override
   public boolean a(bvf $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gl() {
      return 1.0;
   }
}
