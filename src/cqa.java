import javax.annotation.Nullable;

public abstract class cqa extends cql {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cqa(bvm<? extends cqa> $$0, dha $$1) {
      super($$0, $$1);
   }

   protected cqa(bvm<? extends cqa> $$0, double $$1, double $$2, double $$3, dha $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cqa(bvm<? extends cqa> $$0, double $$1, double $$2, double $$3, fbs $$4, dha $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dL(), this.dN());
      this.ay();
      this.a($$4, this.c);
   }

   public cqa(bvm<? extends cqa> $$0, bwb $$1, fbs $$2, dha $$3) {
      this($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2, $$3);
      this.c($$1);
      this.b($$1.dL(), $$1.dN());
   }

   @Override
   protected void a(alg.a $$0) {
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

   protected dgi.a al_() {
      return dgi.a.a;
   }

   @Override
   public void h() {
      bvf $$0 = this.p();
      this.v();
      if (this.dV().C || ($$0 == null || !$$0.dQ()) && this.dV().B(this.dv())) {
         fbq $$1 = cqn.a(this, this::b, this.al_());
         fbs $$2;
         if ($$1.d() != fbq.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dt().e(this.dy());
         }

         cqn.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.m()) {
            this.d(1.0F);
         }

         if ($$1.d() != fbq.a.a && this.bL()) {
            this.b($$1);
         }

         this.w();
      } else {
         this.at();
      }
   }

   private void v() {
      fbs $$0 = this.dy();
      fbs $$1 = this.dt();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.u();
      } else {
         $$4 = this.t();
      }

      this.h($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void w() {
      lq $$0 = this.s();
      fbs $$1 = this.dt();
      if ($$0 != null) {
         this.dV().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bvf $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean m() {
      return true;
   }

   @Nullable
   protected lq s() {
      return ls.af;
   }

   protected float t() {
      return 0.95F;
   }

   protected float u() {
      return 0.8F;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.c = $$0.k("acceleration_power");
      }
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public aac<acr> a(asf $$0) {
      bvf $$1 = this.p();
      int $$2 = $$1 == null ? 0 : $$1.ar();
      fbs $$3 = $$0.b();
      return new acs(this.ar(), this.cG(), $$3.a(), $$3.b(), $$3.c(), $$0.d(), $$0.e(), this.aq(), $$2, $$0.c(), 0.0);
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      fbs $$1 = new fbs($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
   }

   private void a(fbs $$0, double $$1) {
      this.h($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void b(@Nullable bvf $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
