public abstract class cta extends css {
   private static final float a = 12.25F;

   protected cta(bxc<? extends cta> $$0, djx $$1) {
      super($$0, $$1);
   }

   protected cta(bxc<? extends cta> $$0, double $$1, double $$2, double $$3, djx $$4) {
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
   public boolean n(boolean $$0) {
      return true;
   }

   @Override
   public void h() {
      this.j();
      this.be();
      this.g();
      ffo $$0 = csu.a(this, this::b);
      ffq $$1;
      if ($$0.d() != ffo.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.dt().e(this.dy());
      }

      this.b($$1);
      this.A();
      this.aI();
      super.h();
      if ($$0.d() != ffo.a.a && this.bJ()) {
         this.b($$0);
      }
   }

   private void g() {
      ffq $$0 = this.dy();
      ffq $$1 = this.dt();
      float $$4;
      if (this.bi()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(ly.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.i($$0.c((double)$$4));
   }

   private void j() {
      if (this.ak) {
         for (iv $$0 : iv.a(this.cR())) {
            ebe $$1 = this.dV().a_($$0);
            if ($$1.a(dne.nJ)) {
               $$1.a(this.dV(), $$0, this, bxm.a);
            }
         }
      }
   }

   @Override
   protected double bc() {
      return 0.03;
   }
}
