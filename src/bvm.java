public abstract class bvm extends bvg {
   protected static final float bX = 0.0F;

   protected bvm(bup<? extends bvm> $$0, dff $$1) {
      super($$0, $$1);
   }

   public float c(jh $$0) {
      return this.a($$0, this.dY());
   }

   public float a(jh $$0, dfi $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dfg $$0, buo $$1) {
      return this.a(this.dy(), $$0) >= 0.0F;
   }

   public boolean gr() {
      return !this.P().m();
   }

   public boolean gs() {
      if (this.bF.a(cei.Z)) {
         return this.bF.c(cei.Z).isPresent();
      } else {
         for (cdq $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof ccv) {
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
   public void b(bui $$0) {
      super.b($$0);
      if (this.gt() && !this.gs()) {
         this.bS.b(ccc.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         ezr $$3 = new ezr($$0.dD() - this.dD(), $$0.dF() - this.dF(), $$0.dJ() - this.dJ()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dD() + $$3.d, this.dF() + $$3.e, this.dJ() + $$3.f, this.gu());
      }
   }

   @Override
   public boolean a(bui $$0, float $$1) {
      this.a($$0.dy(), 5);
      return true;
   }

   protected double gu() {
      return 1.0;
   }
}
