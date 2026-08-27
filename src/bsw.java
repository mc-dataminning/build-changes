public abstract class bsw extends bsq {
   protected static final float cg = 0.0F;

   protected bsw(bsb<? extends bsw> $$0, dca $$1) {
      super($$0, $$1);
   }

   public float d(ir $$0) {
      return this.a($$0, this.dU());
   }

   public float a(ir $$0, dcd $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dcb $$0, bss $$1) {
      return this.a(this.du(), $$0) >= 0.0F;
   }

   public boolean gu() {
      return !this.J().l();
   }

   public boolean gv() {
      if (this.bO.a(cbr.Z)) {
         return this.bO.c(cbr.Z).isPresent();
      } else {
         for (caz $$0 : this.cb.b()) {
            if ($$0.h() && $$0.k() instanceof cae) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void gk() {
      super.gk();
      brv $$0 = this.gn();
      if ($$0 != null && $$0.dU() == this.dU()) {
         this.a($$0.du(), 5);
         float $$1 = this.f($$0);
         if (this instanceof btk && ((btk)this).x()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.F($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.cb.a(bzl.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dz() - this.dz()) / (double)$$1;
            double $$3 = ($$0.dB() - this.dB()) / (double)$$1;
            double $$4 = ($$0.dF() - this.dF()) / (double)$$1;
            this.g(this.dx().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cv();
         } else if (this.gw() && !this.gv()) {
            this.cb.b(bzl.a.a);
            float $$5 = 2.0F;
            ewu $$6 = new ewu($$0.dz() - this.dz(), $$0.dB() - this.dB(), $$0.dF() - this.dF()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.J().a(this.dz() + $$6.c, this.dB() + $$6.d, this.dF() + $$6.e, this.gx());
         }
      }
   }

   protected boolean gw() {
      return true;
   }

   protected double gx() {
      return 1.0;
   }

   protected void F(float $$0) {
   }
}
