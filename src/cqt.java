public abstract class cqt extends cql {
   private static final float a = 12.25F;

   protected cqt(bvm<? extends cqt> $$0, dha $$1) {
      super($$0, $$1);
   }

   protected cqt(bvm<? extends cqt> $$0, double $$1, double $$2, double $$3, dha $$4) {
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
      fbq $$0 = cqn.a(this, this::b);
      this.bf();
      this.m();
      fbs $$1;
      if ($$0.d() != fbq.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.dt().e(this.dy());
      }

      this.b($$1);
      this.E();
      this.aK();
      super.h();
      if ($$0.d() != fbq.a.a && this.bL()) {
         this.b($$0);
      }
   }

   private void m() {
      fbs $$0 = this.dy();
      fbs $$1 = this.dt();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.h($$0.c((double)$$4));
   }

   @Override
   protected double bd() {
      return 0.03;
   }
}
