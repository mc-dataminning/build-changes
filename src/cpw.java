public abstract class cpw extends cpo {
   private static final float a = 12.25F;

   protected cpw(buq<? extends cpw> $$0, dgg $$1) {
      super($$0, $$1);
   }

   protected cpw(buq<? extends cpw> $$0, double $$1, double $$2, double $$3, dgg $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cR().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   @Override
   public boolean o(boolean $$0) {
      return true;
   }

   @Override
   public void h() {
      this.s();
      this.bf();
      this.m();
      faw $$0 = cpq.a(this, this::b);
      fay $$1;
      if ($$0.d() != faw.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.du().e(this.dz());
      }

      this.b($$1);
      this.F();
      this.aK();
      super.h();
      if ($$0.d() != faw.a.a && this.bL()) {
         this.b($$0);
      }
   }

   private void m() {
      fay $$0 = this.dz();
      fay $$1 = this.du();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dW().a(lt.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.h($$0.c((double)$$4));
   }

   private void s() {
      if (this.ak) {
         for (ji $$0 : ji.a(this.cR())) {
            dwv $$1 = this.dW().a_($$0);
            if ($$1.a(djm.nF)) {
               $$1.a(this.dW(), $$0, this);
            }
         }
      }
   }

   @Override
   protected double bd() {
      return 0.03;
   }
}
