public abstract class bwz extends bwt {
   protected static final float bD = 0.0F;

   protected bwz(bwb<? extends bwz> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public float c(jj $$0) {
      return this.a($$0, this.dV());
   }

   public float a(jj $$0, dhs $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dhq $$0, bwa $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean gm() {
      return !this.O().k();
   }

   public boolean gn() {
      if (this.br.a(cft.aa)) {
         return this.br.c(cft.aa).isPresent();
      } else {
         for (cfb $$0 : this.bB.b()) {
            if ($$0.h() && $$0.k() instanceof ceg) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean go() {
      return true;
   }

   @Override
   public void a(bvs $$0) {
      super.a($$0);
      if (this.go() && !this.gn()) {
         this.bB.b(cdn.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fcu $$3 = new fcu($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.O().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gp());
      }
   }

   @Override
   public boolean a(bvs $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gp() {
      return 1.0;
   }
}
