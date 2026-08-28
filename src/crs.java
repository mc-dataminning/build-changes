import javax.annotation.Nullable;

public abstract class crs extends cse {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected crs(bwr<? extends crs> $$0, djh $$1) {
      super($$0, $$1);
   }

   protected crs(bwr<? extends crs> $$0, double $$1, double $$2, double $$3, djh $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public crs(bwr<? extends crs> $$0, double $$1, double $$2, double $$3, fex $$4, djh $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dK(), this.dM());
      this.av();
      this.a($$4, this.c);
   }

   public crs(bwr<? extends crs> $$0, bxj $$1, fex $$2, djh $$3) {
      this($$0, $$1.dz(), $$1.dB(), $$1.dF(), $$2, $$3);
      this.c($$1);
      this.b($$1.dK(), $$1.dM());
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cQ().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected diq.a af_() {
      return diq.a.a;
   }

   @Override
   public void h() {
      bwi $$0 = this.q();
      this.o();
      if (this.dU().C || ($$0 == null || !$$0.dP()) && this.dU().C(this.du())) {
         fev $$1 = csg.a(this, this::b, this.af_());
         fex $$2;
         if ($$1.d() != fev.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.ds().e(this.dx());
         }

         csg.a(this, 0.2F);
         this.b($$2);
         this.aI();
         super.h();
         if (this.g()) {
            this.e(1.0F);
         }

         if ($$1.d() != fev.a.a && this.bI()) {
            this.b($$1);
         }

         this.s();
      } else {
         this.aq();
      }
   }

   private void o() {
      fex $$0 = this.dx();
      fex $$1 = this.ds();
      float $$4;
      if (this.bh()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dU().a(ly.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.n();
      } else {
         $$4 = this.m();
      }

      this.i($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void s() {
      lw $$0 = this.j();
      fex $$1 = this.ds();
      if ($$0 != null) {
         this.dU().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bwi $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean g() {
      return true;
   }

   @Nullable
   protected lw j() {
      return ly.ah;
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
         this.c = $$0.i("acceleration_power");
      }
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   private void a(fex $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void c(@Nullable bwi $$0, boolean $$1) {
      super.c($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
