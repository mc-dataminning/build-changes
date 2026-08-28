import javax.annotation.Nullable;

public abstract class cra extends crm {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cra(bwj<? extends cra> $$0, dip $$1) {
      super($$0, $$1);
   }

   protected cra(bwj<? extends cra> $$0, double $$1, double $$2, double $$3, dip $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cra(bwj<? extends cra> $$0, double $$1, double $$2, double $$3, fdw $$4, dip $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dL(), this.dN());
      this.ay();
      this.a($$4, this.c);
   }

   public cra(bwj<? extends cra> $$0, bwz $$1, fdw $$2, dip $$3) {
      this($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2, $$3);
      this.c($$1);
      this.b($$1.dL(), $$1.dN());
   }

   @Override
   protected void a(akl.a $$0) {
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

   protected dhy.a f() {
      return dhy.a.a;
   }

   @Override
   public void h() {
      bwa $$0 = this.q();
      this.o();
      if (this.dV().C || ($$0 == null || !$$0.dQ()) && this.dV().C(this.dv())) {
         fdu $$1 = cro.a(this, this::b, this.f());
         fdw $$2;
         if ($$1.d() != fdu.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dt().e(this.dy());
         }

         cro.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.g()) {
            this.e(1.0F);
         }

         if ($$1.d() != fdu.a.a && this.bK()) {
            this.b($$1);
         }

         this.s();
      } else {
         this.at();
      }
   }

   private void o() {
      fdw $$0 = this.dy();
      fdw $$1 = this.dt();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(lx.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.n();
      } else {
         $$4 = this.m();
      }

      this.i($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void s() {
      lv $$0 = this.j();
      fdw $$1 = this.dt();
      if ($$0 != null) {
         this.dV().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bwa $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean g() {
      return true;
   }

   @Nullable
   protected lv j() {
      return lx.ah;
   }

   protected float m() {
      return 0.95F;
   }

   protected float n() {
      return 0.8F;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.c = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   private void a(fdw $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void c(@Nullable bwa $$0, boolean $$1) {
      super.c($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
