public abstract class csp extends csh {
   private static final float a = 12.25F;

   protected csp(bwr<? extends csp> $$0, djm $$1) {
      super($$0, $$1);
   }

   protected csp(bwr<? extends csp> $$0, double $$1, double $$2, double $$3, djm $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cQ().a() * 4.0;
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
      this.bd();
      this.g();
      ffa $$0 = csj.a(this, this::b);
      ffc $$1;
      if ($$0.d() != ffa.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.ds().e(this.dx());
      }

      this.b($$1);
      this.A();
      this.aI();
      super.h();
      if ($$0.d() != ffa.a.a && this.bI()) {
         this.b($$0);
      }
   }

   private void g() {
      ffc $$0 = this.dx();
      ffc $$1 = this.ds();
      float $$4;
      if (this.bh()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dU().a(ly.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.i($$0.c((double)$$4));
   }

   private void j() {
      if (this.ak) {
         for (iv $$0 : iv.a(this.cQ())) {
            eat $$1 = this.dU().a_($$0);
            if ($$1.a(dmt.nJ)) {
               $$1.a(this.dU(), $$0, this, bxb.a);
            }
         }
      }
   }

   @Override
   protected double bb() {
      return 0.03;
   }
}
