public abstract class bvi extends bvc {
   protected static final float bX = 0.0F;

   protected bvi(bul<? extends bvi> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public float c(jh $$0) {
      return this.a($$0, this.dX());
   }

   public float a(jh $$0, dfe $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dfc $$0, buk $$1) {
      return this.a(this.dx(), $$0) >= 0.0F;
   }

   public boolean gq() {
      return !this.P().m();
   }

   public boolean gr() {
      if (this.bF.a(cee.Z)) {
         return this.bF.c(cee.Z).isPresent();
      } else {
         for (cdm $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof ccr) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gs() {
      return true;
   }

   @Override
   public void b(bue $$0) {
      super.b($$0);
      if (this.gs() && !this.gr()) {
         this.bS.b(cby.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         ezn $$3 = new ezn($$0.dC() - this.dC(), $$0.dE() - this.dE(), $$0.dI() - this.dI()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dC() + $$3.d, this.dE() + $$3.e, this.dI() + $$3.f, this.gt());
      }
   }

   @Override
   public boolean a(bue $$0, float $$1) {
      this.a($$0.dx(), 5);
      return true;
   }

   protected double gt() {
      return 1.0;
   }
}
