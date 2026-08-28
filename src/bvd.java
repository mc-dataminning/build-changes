public abstract class bvd extends bux {
   protected static final float bX = 0.0F;

   protected bvd(bug<? extends bvd> $$0, dev $$1) {
      super($$0, $$1);
   }

   public float c(jg $$0) {
      return this.a($$0, this.dX());
   }

   public float a(jg $$0, dey $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dew $$0, buf $$1) {
      return this.a(this.dx(), $$0) >= 0.0F;
   }

   public boolean gr() {
      return !this.P().m();
   }

   public boolean gs() {
      if (this.bC.a(cdz.Z)) {
         return this.bC.c(cdz.Z).isPresent();
      } else {
         for (cdh $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof ccm) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gt() {
      return true;
   }

   @Override
   public void b(btz $$0) {
      super.b($$0);
      if (this.gt() && !this.gs()) {
         this.bS.b(cbt.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         ezh $$3 = new ezh($$0.dC() - this.dC(), $$0.dE() - this.dE(), $$0.dI() - this.dI()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dC() + $$3.d, this.dE() + $$3.e, this.dI() + $$3.f, this.gu());
      }
   }

   @Override
   public boolean a(btz $$0, float $$1) {
      this.a($$0.dx(), 5);
      return true;
   }

   protected double gu() {
      return 1.0;
   }
}
