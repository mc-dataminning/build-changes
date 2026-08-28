public abstract class byc extends bxw {
   protected static final float bH = 0.0F;

   protected byc(bxc<? extends byc> $$0, djx $$1) {
      super($$0, $$1);
   }

   public float c(iv $$0) {
      return this.a($$0, this.dV());
   }

   public float a(iv $$0, dka $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(djy $$0, bxb $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean gq() {
      return !this.O().k();
   }

   public boolean gr() {
      if (this.bs.a(cgw.aa)) {
         return this.bs.c(cgw.aa).isPresent();
      } else {
         for (cge $$0 : this.bF.b()) {
            if ($$0.h() && $$0.k() instanceof cfj) {
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
   public void a(bwt $$0) {
      super.a($$0);
      if (this.gs() && !this.gr()) {
         this.bF.b(ceq.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         ffq $$3 = new ffq($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.O().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gt());
      }
   }

   @Override
   public boolean a(bwt $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gt() {
      return 1.0;
   }
}
