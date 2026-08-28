public abstract class bxh extends bxb {
   protected static final float bE = 0.0F;

   protected bxh(bwj<? extends bxh> $$0, dip $$1) {
      super($$0, $$1);
   }

   public float c(iu $$0) {
      return this.a($$0, this.dV());
   }

   public float a(iu $$0, dis $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(diq $$0, bwi $$1) {
      return this.a(this.dv(), $$0) >= 0.0F;
   }

   public boolean gm() {
      return !this.O().k();
   }

   public boolean gn() {
      if (this.bs.a(cgb.aa)) {
         return this.bs.c(cgb.aa).isPresent();
      } else {
         for (cfj $$0 : this.bC.b()) {
            if ($$0.h() && $$0.k() instanceof ceo) {
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
   public void a(bwa $$0) {
      super.a($$0);
      if (this.go() && !this.gn()) {
         this.bC.b(cdv.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fdw $$3 = new fdw($$0.dA() - this.dA(), $$0.dC() - this.dC(), $$0.dG() - this.dG()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.O().a(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f, this.gp());
      }
   }

   @Override
   public boolean a(bwa $$0, float $$1) {
      this.a($$0.dv(), 5);
      return true;
   }

   protected double gp() {
      return 1.0;
   }
}
