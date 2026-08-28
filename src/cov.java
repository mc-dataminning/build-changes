import javax.annotation.Nullable;

public abstract class cov extends cpg {
   public static final double b = 0.1;
   public static final double c = 0.5;
   public double d = 0.1;

   protected cov(bul<? extends cov> $$0, dfb $$1) {
      super($$0, $$1);
   }

   protected cov(bul<? extends cov> $$0, double $$1, double $$2, double $$3, dfb $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cov(bul<? extends cov> $$0, double $$1, double $$2, double $$3, ezn $$4, dfb $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dN(), this.dP());
      this.aA();
      this.a($$4, this.d);
   }

   public cov(bul<? extends cov> $$0, bva $$1, ezn $$2, dfb $$3) {
      this($$0, $$1.dC(), $$1.dE(), $$1.dI(), $$2, $$3);
      this.c($$1);
      this.a($$1.dN(), $$1.dP());
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cS().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dej.a ak_() {
      return dej.a.a;
   }

   @Override
   public void l() {
      bue $$0 = this.s();
      if (this.dX().C || ($$0 == null || !$$0.dS()) && this.dX().B(this.dx())) {
         ezl $$1 = cpi.a(this, this::b, this.ak_());
         ezn $$2;
         if ($$1.d() != ezl.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dv().e(this.dA());
         }

         cpi.a(this, 0.2F);
         this.b($$2);
         this.aL();
         super.l();
         if (this.o()) {
            this.d(1.0F);
         }

         if ($$1.d() != ezl.a.a && this.bM()) {
            this.b($$1);
         }

         this.w();
         this.x();
      } else {
         this.av();
      }
   }

   private void w() {
      ezn $$0 = this.dA();
      ezn $$1 = this.dv();
      float $$4;
      if (this.bk()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dX().a(lr.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.v();
      } else {
         $$4 = this.t();
      }

      this.h($$0.e($$0.d().c(this.d)).c((double)$$4));
   }

   private void x() {
      lp $$0 = this.q();
      ezn $$1 = this.dv();
      if ($$0 != null) {
         this.dX().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(bue $$0) {
      return super.b($$0) && !$$0.ae;
   }

   @Override
   protected boolean o() {
      return true;
   }

   @Nullable
   protected lp q() {
      return lr.ae;
   }

   protected float t() {
      return 0.95F;
   }

   protected float v() {
      return 0.8F;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.d);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.d = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   public zp<ace> a(arm $$0) {
      bue $$1 = this.s();
      int $$2 = $$1 == null ? 0 : $$1.as();
      ezn $$3 = $$0.b();
      return new acf(this.as(), this.cH(), $$3.a(), $$3.b(), $$3.c(), $$0.d(), $$0.e(), this.ar(), $$2, $$0.c(), 0.0);
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      ezn $$1 = new ezn($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
   }

   private void a(ezn $$0, double $$1) {
      this.h($$0.d().c($$1));
      this.as = true;
   }

   @Override
   protected void b(@Nullable bue $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = 0.1;
      } else {
         this.d *= 0.5;
      }
   }
}
