import javax.annotation.Nullable;

public abstract class cmf extends cms {
   public double b;
   public double c;
   public double d;

   protected cmf(bsb<? extends cmf> $$0, dca $$1) {
      super($$0, $$1);
   }

   protected cmf(bsb<? extends cmf> $$0, double $$1, double $$2, double $$3, dca $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cmf(bsb<? extends cmf> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dca $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dK(), this.dM());
      this.at();
      this.q($$4, $$5, $$6);
   }

   public cmf(bsb<? extends cmf> $$0, bso $$1, double $$2, double $$3, double $$4, dca $$5) {
      this($$0, $$1.dz(), $$1.dB(), $$1.dF(), $$2, $$3, $$4, $$5);
      this.c($$1);
      this.a($$1.dK(), $$1.dM());
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cP().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dbj.a ag_() {
      return dbj.a.a;
   }

   @Override
   public void l() {
      brv $$0 = this.t();
      if (this.dU().C || ($$0 == null || !$$0.dP()) && this.dU().B(this.du())) {
         super.l();
         if (this.r()) {
            this.g(1);
         }

         ews $$1 = cmu.a(this, this::b, this.ag_());
         if ($$1.c() != ews.a.a) {
            this.a($$1);
         }

         this.aW();
         ewu $$2 = this.dx();
         double $$3 = this.dz() + $$2.c;
         double $$4 = this.dB() + $$2.d;
         double $$5 = this.dF() + $$2.e;
         cmu.a(this, 0.2F);
         float $$8;
         if (this.bi()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dU().a(lb.d, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.x();
         } else {
            $$8 = this.w();
         }

         this.g($$2.b(this.b, this.c, this.d).a((double)$$8));
         kz $$10 = this.u();
         if ($$10 != null) {
            this.dU().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.ao();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.q($$0, $$1, $$2);
   }

   @Override
   protected boolean b(brv $$0) {
      return super.b($$0) && !$$0.ah;
   }

   @Override
   protected boolean r() {
      return true;
   }

   @Nullable
   protected kz u() {
      return lb.ac;
   }

   protected float w() {
      return 0.95F;
   }

   protected float x() {
      return 0.8F;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         uq $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public float bP() {
      return 1.0F;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bA();
         brv $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dU().C) {
               ewu $$3 = $$2.bQ();
               this.g($$3);
               this.b = $$3.c * 0.1;
               this.c = $$3.d * 0.1;
               this.d = $$3.e * 0.1;
               this.c($$2);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public zl<abw> dq() {
      brv $$0 = this.t();
      int $$1 = $$0 == null ? 0 : $$0.al();
      return new abx(this.al(), this.cE(), this.dz(), this.dB(), this.dF(), this.dM(), this.dK(), this.ak(), $$1, new ewu(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.q($$1, $$2, $$3);
   }

   private void q(double $$0, double $$1, double $$2) {
      double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      if ($$3 != 0.0) {
         this.b = $$0 / $$3 * 0.1;
         this.c = $$1 / $$3 * 0.1;
         this.d = $$2 / $$3 * 0.1;
      }
   }
}
