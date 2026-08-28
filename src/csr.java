import javax.annotation.Nullable;

public abstract class csr extends ctd {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected csr(bxn<? extends csr> $$0, dkj $$1) {
      super($$0, $$1);
   }

   protected csr(bxn<? extends csr> $$0, double $$1, double $$2, double $$3, dkj $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public csr(bxn<? extends csr> $$0, double $$1, double $$2, double $$3, fgc $$4, dkj $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dL(), this.dN());
      this.av();
      this.a($$4, this.c);
   }

   public csr(bxn<? extends csr> $$0, byf $$1, fgc $$2, dkj $$3) {
      this($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2, $$3);
      this.c($$1);
      this.b($$1.dL(), $$1.dN());
   }

   @Override
   protected void a(aky.a $$0) {
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

   protected djq.a ag_() {
      return djq.a.a;
   }

   @Override
   public void g() {
      bxe $$0 = this.p();
      this.n();
      if (this.dV().C || ($$0 == null || !$$0.dQ()) && this.dV().C(this.dv())) {
         fga $$1 = ctf.a(this, this::b, this.ag_());
         fgc $$2;
         if ($$1.d() != fga.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dt().e(this.dy());
         }

         ctf.a(this, 0.2F);
         this.b($$2);
         this.aI();
         super.g();
         if (this.f()) {
            this.e(1.0F);
         }

         if ($$1.d() != fga.a.a && this.bJ()) {
            this.b($$1);
         }

         this.r();
      } else {
         this.aq();
      }
   }

   private void n() {
      fgc $$0 = this.dy();
      fgc $$1 = this.dt();
      float $$4;
      if (this.bi()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(lz.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.m();
      } else {
         $$4 = this.l();
      }

      this.i($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void r() {
      lx $$0 = this.i();
      fgc $$1 = this.dt();
      if ($$0 != null) {
         this.dV().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bxe $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean f() {
      return true;
   }

   @Nullable
   protected lx i() {
      return lz.ah;
   }

   protected float l() {
      return 0.95F;
   }

   protected float m() {
      return 0.8F;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c = $$0.b("acceleration_power", 0.1);
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   private void a(fgc $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void c(@Nullable bxe $$0, boolean $$1) {
      super.c($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
