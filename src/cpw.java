import javax.annotation.Nullable;

public abstract class cpw extends cqh {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cpw(bvi<? extends cpw> $$0, dgz $$1) {
      super($$0, $$1);
   }

   protected cpw(bvi<? extends cpw> $$0, double $$1, double $$2, double $$3, dgz $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cpw(bvi<? extends cpw> $$0, double $$1, double $$2, double $$3, fbr $$4, dgz $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dM(), this.dO());
      this.ay();
      this.a($$4, this.c);
   }

   public cpw(bvi<? extends cpw> $$0, bvx $$1, fbr $$2, dgz $$3) {
      this($$0, $$1.dB(), $$1.dD(), $$1.dH(), $$2, $$3);
      this.c($$1);
      this.b($$1.dM(), $$1.dO());
   }

   @Override
   protected void a(akw.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cR().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dgh.a al_() {
      return dgh.a.a;
   }

   @Override
   public void h() {
      bvb $$0 = this.p();
      this.v();
      if (this.dW().C || ($$0 == null || !$$0.dR()) && this.dW().B(this.dw())) {
         fbp $$1 = cqj.a(this, this::b, this.al_());
         fbr $$2;
         if ($$1.d() != fbp.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.du().e(this.dz());
         }

         cqj.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.m()) {
            this.d(1.0F);
         }

         if ($$1.d() != fbp.a.a && this.bL()) {
            this.b($$1);
         }

         this.w();
      } else {
         this.at();
      }
   }

   private void v() {
      fbr $$0 = this.dz();
      fbr $$1 = this.du();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dW().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.u();
      } else {
         $$4 = this.t();
      }

      this.h($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void w() {
      lq $$0 = this.s();
      fbr $$1 = this.du();
      if ($$0 != null) {
         this.dW().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bvb $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean m() {
      return true;
   }

   @Nullable
   protected lq s() {
      return ls.ag;
   }

   protected float t() {
      return 0.95F;
   }

   protected float u() {
      return 0.8F;
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.c = $$0.k("acceleration_power");
      }
   }

   @Override
   public float by() {
      return 1.0F;
   }

   private void a(fbr $$0, double $$1) {
      this.h($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void b(@Nullable bvb $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
