import javax.annotation.Nullable;

public abstract class cpc extends cpn {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cpc(bus<? extends cpc> $$0, dfm $$1) {
      super($$0, $$1);
   }

   protected cpc(bus<? extends cpc> $$0, double $$1, double $$2, double $$3, dfm $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cpc(bus<? extends cpc> $$0, double $$1, double $$2, double $$3, ezy $$4, dfm $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dL(), this.dN());
      this.ay();
      this.a($$4, this.c);
   }

   public cpc(bus<? extends cpc> $$0, bvh $$1, ezy $$2, dfm $$3) {
      this($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2, $$3);
      this.c($$1);
      this.a($$1.dL(), $$1.dN());
   }

   @Override
   protected void a(akq.a $$0) {
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

   protected deu.a ak_() {
      return deu.a.a;
   }

   @Override
   public void h() {
      bul $$0 = this.p();
      this.t();
      if (this.dV().C || ($$0 == null || !$$0.dQ()) && this.dV().B(this.dv())) {
         ezw $$1 = cpp.a(this, this::b, this.ak_());
         ezy $$2;
         if ($$1.d() != ezw.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dt().e(this.dy());
         }

         cpp.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.l()) {
            this.d(1.0F);
         }

         if ($$1.d() != ezw.a.a && this.bL()) {
            this.b($$1);
         }

         this.u();
      } else {
         this.at();
      }
   }

   private void t() {
      ezy $$0 = this.dy();
      ezy $$1 = this.dt();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.s();
      } else {
         $$4 = this.q();
      }

      this.h($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void u() {
      lq $$0 = this.n();
      ezy $$1 = this.dt();
      if ($$0 != null) {
         this.dV().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bul $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean l() {
      return true;
   }

   @Nullable
   protected lq n() {
      return ls.ae;
   }

   protected float q() {
      return 0.95F;
   }

   protected float s() {
      return 0.8F;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(ul $$0) {
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
   public zq<acf> a(arn $$0) {
      bul $$1 = this.p();
      int $$2 = $$1 == null ? 0 : $$1.ar();
      ezy $$3 = $$0.b();
      return new acg(this.ar(), this.cG(), $$3.a(), $$3.b(), $$3.c(), $$0.d(), $$0.e(), this.aq(), $$2, $$0.c(), 0.0);
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      ezy $$1 = new ezy($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
   }

   private void a(ezy $$0, double $$1) {
      this.h($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void b(@Nullable bul $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
