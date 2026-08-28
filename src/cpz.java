import javax.annotation.Nullable;

public abstract class cpz extends cqk {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cpz(bvi<? extends cpz> $$0, dgz $$1) {
      super($$0, $$1);
   }

   protected cpz(bvi<? extends cpz> $$0, double $$1, double $$2, double $$3, dgz $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cpz(bvi<? extends cpz> $$0, double $$1, double $$2, double $$3, fbx $$4, dgz $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dK(), this.dM());
      this.ay();
      this.a($$4, this.c);
   }

   public cpz(bvi<? extends cpz> $$0, bvy $$1, fbx $$2, dgz $$3) {
      this($$0, $$1.dz(), $$1.dB(), $$1.dF(), $$2, $$3);
      this.c($$1);
      this.b($$1.dK(), $$1.dM());
   }

   @Override
   protected void a(akb.a $$0) {
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

   protected dgi.a ai_() {
      return dgi.a.a;
   }

   @Override
   public void h() {
      bva $$0 = this.q();
      this.o();
      if (this.dU().C || ($$0 == null || !$$0.dP()) && this.dU().B(this.du())) {
         fbv $$1 = cqm.a(this, this::b, this.ai_());
         fbx $$2;
         if ($$1.d() != fbv.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.ds().e(this.dx());
         }

         cqm.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.g()) {
            this.e(1.0F);
         }

         if ($$1.d() != fbv.a.a && this.bJ()) {
            this.b($$1);
         }

         this.s();
      } else {
         this.at();
      }
   }

   private void o() {
      fbx $$0 = this.dx();
      fbx $$1 = this.ds();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dU().a(lt.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.n();
      } else {
         $$4 = this.m();
      }

      this.i($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void s() {
      lr $$0 = this.j();
      fbx $$1 = this.ds();
      if ($$0 != null) {
         this.dU().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bva $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   protected boolean g() {
      return true;
   }

   @Nullable
   protected lr j() {
      return lt.ah;
   }

   protected float m() {
      return 0.95F;
   }

   protected float n() {
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
   public float bw() {
      return 1.0F;
   }

   private void a(fbx $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.ar = true;
   }

   @Override
   protected void b(@Nullable bva $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
