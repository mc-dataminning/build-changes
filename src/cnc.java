import javax.annotation.Nullable;

public abstract class cnc extends cnn {
   public static final double b = 0.1;
   public static final double c = 0.5;
   public double d = 0.1;

   protected cnc(bsw<? extends cnc> $$0, dcu $$1) {
      super($$0, $$1);
   }

   protected cnc(bsw<? extends cnc> $$0, double $$1, double $$2, double $$3, dcu $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cnc(bsw<? extends cnc> $$0, double $$1, double $$2, double $$3, eww $$4, dcu $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dG(), this.dI());
      this.av();
      this.a($$4, this.d);
   }

   public cnc(bsw<? extends cnc> $$0, btl $$1, eww $$2, dcu $$3) {
      this($$0, $$1.dv(), $$1.dx(), $$1.dB(), $$2, $$3);
      this.c($$1);
      this.a($$1.dG(), $$1.dI());
   }

   @Override
   protected void a(ajz.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dcd.a af_() {
      return dcd.a.a;
   }

   @Override
   public void l() {
      bsq $$0 = this.s();
      if (this.dQ().B || ($$0 == null || !$$0.dL()) && this.dQ().B(this.dq())) {
         super.l();
         if (this.t()) {
            this.d(1.0F);
         }

         ewu $$1 = cnp.a(this, this::b, this.af_());
         if ($$1.c() != ewu.a.a) {
            this.b($$1);
         }

         this.aT();
         eww $$2 = this.dt();
         double $$3 = this.dv() + $$2.c;
         double $$4 = this.dx() + $$2.d;
         double $$5 = this.dB() + $$2.e;
         cnp.a(this, 0.2F);
         float $$8;
         if (this.bf()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dQ().a(lm.d, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.x();
         } else {
            $$8 = this.w();
         }

         this.i($$2.e($$2.d().a(this.d)).a((double)$$8));
         lk $$10 = this.v();
         if ($$10 != null) {
            this.dQ().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.aq();
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(bsq $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   protected boolean t() {
      return true;
   }

   @Nullable
   protected lk v() {
      return lm.ae;
   }

   protected float w() {
      return 0.95F;
   }

   protected float x() {
      return 0.8F;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("acceleration_power", this.d);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("acceleration_power", 6)) {
         this.d = $$0.k("acceleration_power");
      }
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   public zf<abt> dm() {
      bsq $$0 = this.s();
      int $$1 = $$0 == null ? 0 : $$0.an();
      return new abu(this.an(), this.cA(), this.dv(), this.dx(), this.dB(), this.dI(), this.dG(), this.am(), $$1, this.dt(), 0.0);
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      eww $$1 = new eww($$0.j(), $$0.k(), $$0.l());
      this.i($$1);
   }

   private void a(eww $$0, double $$1) {
      this.i($$0.d().a($$1));
      this.av = true;
   }

   @Override
   protected void b(@Nullable bsq $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = 0.1;
      } else {
         this.d *= 0.5;
      }
   }
}
