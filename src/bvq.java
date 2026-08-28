public abstract class bvq extends bvk {
   protected static final float bX = 0.0F;

   protected bvq(but<? extends bvq> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public float c(ji $$0) {
      return this.a($$0, this.dV());
   }

   public float a(ji $$0, dgm $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dgk $$0, bus $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean go() {
      return !this.P().k();
   }

   public boolean gp() {
      if (this.bE.a(cem.Z)) {
         return this.bE.c(cem.Z).isPresent();
      } else {
         for (cdu $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof ccz) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gq() {
      return true;
   }

   @Override
   public void a(bum $$0) {
      super.a($$0);
      if (this.gq() && !this.gp()) {
         this.bS.b(ccg.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fbb $$3 = new fbb($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gr());
      }
   }

   @Override
   public boolean a(bum $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gr() {
      return 1.0;
   }
}
