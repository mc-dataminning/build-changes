public abstract class btw extends btp {
   protected static final float bZ = 0.0F;

   protected btw(bsx<? extends btw> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public float c(jd $$0) {
      return this.a($$0, this.dO());
   }

   public float a(jd $$0, dcz $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dcx $$0, btr $$1) {
      return this.a(this.do(), $$0) >= 0.0F;
   }

   public boolean gg() {
      return !this.N().l();
   }

   public boolean gh() {
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

   protected boolean gi() {
      return true;
   }

   @Override
   public void b(bsr $$0) {
      super.b($$0);
      if (this.gi() && !this.gh()) {
         this.bU.b(cam.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         exc $$3 = new exc($$0.dt() - this.dt(), $$0.dv() - this.dv(), $$0.dz() - this.dz()).d().a((double)Math.max($$2 - 2.0F, 0.0F));
         this.N().a(this.dt() + $$3.c, this.dv() + $$3.d, this.dz() + $$3.e, this.gj());
      }
   }

   @Override
   public boolean a(bsr $$0, float $$1) {
      this.a($$0.do(), 5);
      return true;
   }

   protected double gj() {
      return 1.0;
   }
}
