public abstract class btw extends btp {
   protected static final float bZ = 0.0F;

   protected btw(bsx<? extends btw> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public float c(jd $$0) {
      return this.a($$0, this.dP());
   }

   public float a(jd $$0, dcz $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dcx $$0, btr $$1) {
      return this.a(this.dp(), $$0) >= 0.0F;
   }

   public boolean gh() {
      return !this.N().l();
   }

   public boolean gi() {
      if (this.bF.a(ccs.Z)) {
         return this.bF.c(ccs.Z).isPresent();
      } else {
         for (cca $$0 : this.bU.b()) {
            if ($$0.h() && $$0.k() instanceof cbf) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gj() {
      return true;
   }

   @Override
   public void b(bsr $$0) {
      super.b($$0);
      if (this.gj() && !this.gi()) {
         this.bU.b(cam.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         exa $$3 = new exa($$0.du() - this.du(), $$0.dw() - this.dw(), $$0.dA() - this.dA()).d().a((double)Math.max($$2 - 2.0F, 0.0F));
         this.N().a(this.du() + $$3.c, this.dw() + $$3.d, this.dA() + $$3.e, this.gk());
      }
   }

   @Override
   public boolean a(bsr $$0, float $$1) {
      this.a($$0.dp(), 5);
      return true;
   }

   protected double gk() {
      return 1.0;
   }
}
