import javax.annotation.Nullable;

public abstract class cqq extends crb {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cqq(bwb<? extends cqq> $$0, dhp $$1) {
      super($$0, $$1);
   }

   protected cqq(bwb<? extends cqq> $$0, double $$1, double $$2, double $$3, dhp $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cqq(bwb<? extends cqq> $$0, double $$1, double $$2, double $$3, fcu $$4, dhp $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dL(), this.dN());
      this.ay();
      this.a($$4, this.c);
   }

   public cqq(bwb<? extends cqq> $$0, bwr $$1, fcu $$2, dhp $$3) {
      this($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2, $$3);
      this.c($$1);
      this.b($$1.dL(), $$1.dN());
   }

   @Override
   protected void a(akk.a $$0) {
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

   protected dgy.a ae_() {
      return dgy.a.a;
   }

   @Override
   public void h() {
      bvs $$0 = this.q();
      this.o();
      if (this.dV().C || ($$0 == null || !$$0.dQ()) && this.dV().B(this.dv())) {
         fcs $$1 = crd.a(this, this::b, this.ae_());
         fcu $$2;
         if ($$1.d() != fcs.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dt().e(this.dy());
         }

         crd.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.g()) {
            this.e(1.0F);
         }

         if ($$1.d() != fcs.a.a && this.bK()) {
            this.b($$1);
         }

         this.s();
      } else {
         this.at();
      }
   }

   private void o() {
      fcu $$0 = this.dy();
      fcu $$1 = this.dt();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dV().a(lv.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.n();
      } else {
         $$4 = this.m();
      }

      this.i($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void s() {
      lt $$0 = this.j();
      fcu $$1 = this.dt();
      if ($$0 != null) {
         this.dV().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bvs $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean g() {
      return true;
   }

   @Nullable
   protected lt j() {
      return lv.ah;
   }

   protected float m() {
      return 0.95F;
   }

   protected float n() {
      return 0.8F;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.c = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   private void a(fcu $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void b(@Nullable bvs $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
