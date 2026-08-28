import javax.annotation.Nullable;

public abstract class cpf extends cpq {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cpf(bur<? extends cpf> $$0, dgi $$1) {
      super($$0, $$1);
   }

   protected cpf(bur<? extends cpf> $$0, double $$1, double $$2, double $$3, dgi $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cpf(bur<? extends cpf> $$0, double $$1, double $$2, double $$3, fba $$4, dgi $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dM(), this.dO());
      this.ay();
      this.a($$4, this.c);
   }

   public cpf(bur<? extends cpf> $$0, bvg $$1, fba $$2, dgi $$3) {
      this($$0, $$1.dB(), $$1.dD(), $$1.dH(), $$2, $$3);
      this.c($$1);
      this.b($$1.dM(), $$1.dO());
   }

   @Override
   protected void a(akb.a $$0) {
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

   protected dfq.a ak_() {
      return dfq.a.a;
   }

   @Override
   public void h() {
      buk $$0 = this.p();
      this.v();
      if (this.dW().C || ($$0 == null || !$$0.dR()) && this.dW().B(this.dw())) {
         fay $$1 = cps.a(this, this::b, this.ak_());
         fba $$2;
         if ($$1.d() != fay.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.du().e(this.dz());
         }

         cps.a(this, 0.2F);
         this.b($$2);
         this.aK();
         super.h();
         if (this.m()) {
            this.d(1.0F);
         }

         if ($$1.d() != fay.a.a && this.bL()) {
            this.b($$1);
         }

         this.w();
      } else {
         this.at();
      }
   }

   private void v() {
      fba $$0 = this.dz();
      fba $$1 = this.du();
      float $$4;
      if (this.bj()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dW().a(lt.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.u();
      } else {
         $$4 = this.t();
      }

      this.h($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void w() {
      lr $$0 = this.s();
      fba $$1 = this.du();
      if ($$0 != null) {
         this.dW().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
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

   private void a(fba $$0, double $$1) {
      this.h($$0.d().c($$1));
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
