public abstract class bvp extends bvj {
   protected static final float bX = 0.0F;

   protected bvp(bus<? extends bvp> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public float c(ji $$0) {
      return this.a($$0, this.dV());
   }

   public float a(ji $$0, dgl $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dgj $$0, bur $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean go() {
      return !this.P().k();
   }

   public boolean gp() {
      if (this.bE.a(cel.Z)) {
         return this.bE.c(cel.Z).isPresent();
      } else {
         for (cdt $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof ccy) {
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
   public void a(bul $$0) {
      super.a($$0);
      if (this.gq() && !this.gp()) {
         this.bS.b(ccf.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fba $$3 = new fba($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.P().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gr());
      }
   }

   @Override
   public boolean a(bul $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gr() {
      return 1.0;
   }
}
