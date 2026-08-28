public abstract class btu extends btn {
   protected static final float bZ = 0.0F;

   protected btu(bsw<? extends btu> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public float c(jd $$0) {
      return this.a($$0, this.dQ());
   }

   public float a(jd $$0, dcx $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dcv $$0, btp $$1) {
      return this.a(this.dq(), $$0) >= 0.0F;
   }

   public boolean gi() {
      return !this.J().l();
   }

   public boolean gj() {
      if (this.bF.a(ccq.Z)) {
         return this.bF.c(ccq.Z).isPresent();
      } else {
         for (cby $$0 : this.bU.b()) {
            if ($$0.h() && $$0.k() instanceof cbd) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void fX() {
      super.fX();
      bsq $$0 = this.ga();
      if ($$0 != null && $$0.dQ() == this.dQ()) {
         this.a($$0.dq(), 5);
         float $$1 = this.f($$0);
         if (this instanceof buj && ((buj)this).x()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.G($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bU.a(cak.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dv() - this.dv()) / (double)$$1;
            double $$3 = ($$0.dx() - this.dx()) / (double)$$1;
            double $$4 = ($$0.dB() - this.dB()) / (double)$$1;
            this.i(this.dt().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cr();
         } else if (this.gk() && !this.gj()) {
            this.bU.b(cak.a.a);
            float $$5 = 2.0F;
            eww $$6 = new eww($$0.dv() - this.dv(), $$0.dx() - this.dx(), $$0.dB() - this.dB()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.J().a(this.dv() + $$6.c, this.dx() + $$6.d, this.dB() + $$6.e, this.gl());
         }
      }
   }

   protected boolean gk() {
      return true;
   }

   protected double gl() {
      return 1.0;
   }

   protected void G(float $$0) {
   }
}
