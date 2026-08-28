import javax.annotation.Nullable;

public abstract class crg extends crs {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected crg(bwm<? extends crg> $$0, div $$1) {
      super($$0, $$1);
   }

   protected crg(bwm<? extends crg> $$0, double $$1, double $$2, double $$3, div $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public crg(bwm<? extends crg> $$0, double $$1, double $$2, double $$3, fei $$4, div $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dL(), this.dN());
      this.ay();
      this.a($$4, this.c);
   }

   public crg(bwm<? extends crg> $$0, bxc $$1, fei $$2, div $$3) {
      this($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2, $$3);
      this.c($$1);
      this.b($$1.dL(), $$1.dN());
   }

   @Override
   protected void a(akn.a $$0) {
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

   protected die.a ae_() {
      return die.a.a;
   }

   @Override
   public void h() {
      bwd $$0 = this.q();
      this.o();
      if (this.dV().C || ($$0 == null || !$$0.dQ()) && this.dV().C(this.dv())) {
         feg $$1 = cru.a(this, this::b, this.ae_());
         fei $$2;
         if ($$1.d() != feg.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dt().e(this.dy());
         }

         cru.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.g()) {
            this.e(1.0F);
         }

         if ($$1.d() != feg.a.a && this.bK()) {
            this.b($$1);
         }

         this.s();
      } else {
         this.at();
      }
   }

   private void o() {
      fei $$0 = this.dy();
      fei $$1 = this.dt();
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
      fei $$1 = this.dt();
      if ($$0 != null) {
         this.dV().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bwd $$0) {
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.c = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   private void a(fei $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void c(@Nullable bwd $$0, boolean $$1) {
      super.c($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
