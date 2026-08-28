public abstract class byn extends byh {
   protected static final float bH = 0.0F;

   protected byn(bxn<? extends byn> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public float c(iw $$0) {
      return this.a($$0, this.dV());
   }

   public float a(iw $$0, dkm $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dkk $$0, bxm $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean gq() {
      return !this.N().k();
   }

   public boolean gr() {
      if (this.bs.a(chh.aa)) {
         return this.bs.c(chh.aa).isPresent();
      } else {
         for (cgp $$0 : this.bF.b()) {
            if ($$0.h() && $$0.k() instanceof cfu) {
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
   public void a(bxe $$0) {
      super.a($$0);
      if (this.gs() && !this.gr()) {
         this.bF.b(cfb.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fgc $$3 = new fgc($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.N().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gt());
      }
   }

   @Override
   public boolean a(bxe $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gt() {
      return 1.0;
   }
}
