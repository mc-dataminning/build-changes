import javax.annotation.Nullable;

public abstract class cpe extends cpp {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cpe(bur<? extends cpe> $$0, dgh $$1) {
      super($$0, $$1);
   }

   protected cpe(bur<? extends cpe> $$0, double $$1, double $$2, double $$3, dgh $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cpe(bur<? extends cpe> $$0, double $$1, double $$2, double $$3, faz $$4, dgh $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dL(), this.dN());
      this.ay();
      this.a($$4, this.c);
   }

   public cpe(bur<? extends cpe> $$0, bvg $$1, faz $$2, dgh $$3) {
      this($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2, $$3);
      this.c($$1);
      this.b($$1.dL(), $$1.dN());
   }

   @Override
   protected void a(akc.a $$0) {
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

   protected dfp.a ak_() {
      return dfp.a.a;
   }

   @Override
   public void h() {
      buk $$0 = this.p();
      this.v();
      if (this.dV().C || ($$0 == null || !$$0.dQ()) && this.dV().B(this.dv())) {
         fax $$1 = cpr.a(this, this::b, this.ak_());
         faz $$2;
         if ($$1.d() != fax.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dt().e(this.dy());
         }

         cpr.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.m()) {
            this.d(1.0F);
         }

         if ($$1.d() != fax.a.a && this.bL()) {
            this.b($$1);
         }

         this.w();
      } else {
         this.at();
      }
   }

   private void v() {
      faz $$0 = this.dy();
      faz $$1 = this.dt();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(lt.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.u();
      } else {
         $$4 = this.t();
      }

      this.i($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void w() {
      lr $$0 = this.s();
      faz $$1 = this.dt();
      if ($$0 != null) {
         this.dV().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(buk $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean m() {
      return true;
   }

   @Nullable
   protected lr s() {
      return lt.ag;
   }

   protected float t() {
      return 0.95F;
   }

   protected float u() {
      return 0.8F;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.c = $$0.k("acceleration_power");
      }
   }

   @Override
   public float by() {
      return 1.0F;
   }

   private void a(faz $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void b(@Nullable buk $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
