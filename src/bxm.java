public abstract class bxm extends bxg {
   protected static final float bF = 0.0F;

   protected bxm(bwo<? extends bxm> $$0, dja $$1) {
      super($$0, $$1);
   }

   public float c(iu $$0) {
      return this.a($$0, this.dV());
   }

   public float a(iu $$0, djd $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(djb $$0, bwn $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean gn() {
      return !this.O().k();
   }

   public boolean go() {
      if (this.bs.a(cgg.aa)) {
         return this.bs.c(cgg.aa).isPresent();
      } else {
         for (cfo $$0 : this.bD.b()) {
            if ($$0.h() && $$0.k() instanceof cet) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gp() {
      return true;
   }

   @Override
   public void a(bwf $$0) {
      super.a($$0);
      if (this.gp() && !this.go()) {
         this.bD.b(cea.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         feq $$3 = new feq($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.O().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gq());
      }
   }

   @Override
   public boolean a(bwf $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gq() {
      return 1.0;
   }
}
