import javax.annotation.Nullable;

public abstract class cmz extends cnk {
   public static final double b = 0.05;
   public double c;
   public double d;
   public double e;

   protected cmz(bsv<? extends cmz> $$0, dbt $$1) {
      super($$0, $$1);
   }

   protected cmz(bsv<? extends cmz> $$0, double $$1, double $$2, double $$3, dbt $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cmz(bsv<? extends cmz> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbt $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dF(), this.dH());
      this.at();
      this.q($$4, $$5, $$6);
   }

   public cmz(bsv<? extends cmz> $$0, btk $$1, double $$2, double $$3, double $$4, dbt $$5) {
      this($$0, $$1.du(), $$1.dw(), $$1.dA(), $$2, $$3, $$4, $$5);
      this.c($$1);
      this.a($$1.dF(), $$1.dH());
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dbc.a ag_() {
      return dbc.a.a;
   }

   @Override
   public void l() {
      bsp $$0 = this.s();
      if (this.dP().B || ($$0 == null || !$$0.dK()) && this.dP().B(this.dp())) {
         super.l();
         if (this.u()) {
            this.g(1);
         }

         evk $$1 = cnm.a(this, this::b, this.ag_());
         if ($$1.c() != evk.a.a) {
            this.b($$1);
         }

         this.aS();
         evm $$2 = this.ds();
         double $$3 = this.du() + $$2.c;
         double $$4 = this.dw() + $$2.d;
         double $$5 = this.dA() + $$2.e;
         cnm.a(this, 0.2F);
         float $$8;
         if (this.be()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dP().a(lj.d, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.x();
         } else {
            $$8 = this.w();
         }

         this.h($$2.b(this.c, this.d, this.e).a((double)$$8));
         lh $$10 = this.v();
         if ($$10 != null) {
            this.dP().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.ao();
      }
   }

   @Override
   protected boolean b(bsp $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   protected boolean u() {
      return true;
   }

   @Nullable
   protected lh v() {
      return lj.ae;
   }

   protected float w() {
      return 0.95F;
   }

   protected float x() {
      return 0.8F;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.c, this.d, this.e}));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         ux $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.c = $$1.h(0);
            this.d = $$1.h(1);
            this.e = $$1.h(2);
         }
      }
   }

   @Override
   protected void d(bsp $$0) {
      evm $$1 = $$0.bL();
      this.h($$1);
      this.c = $$1.c * 0.1;
      this.d = $$1.d * 0.1;
      this.e = $$1.e * 0.1;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   public zs<ace> dl() {
      bsp $$0 = this.s();
      int $$1 = $$0 == null ? 0 : $$0.al();
      return new acf(this.al(), this.cz(), this.du(), this.dw(), this.dA(), this.dH(), this.dF(), this.ak(), $$1, new evm(this.c, this.d, this.e), 0.0);
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.q($$1, $$2, $$3);
   }

   private void q(double $$0, double $$1, double $$2) {
      double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      if ($$3 != 0.0) {
         this.c = $$0 / $$3 * 0.1;
         this.d = $$1 / $$3 * 0.1;
         this.e = $$2 / $$3 * 0.1;
      }
   }

   @Override
   public void af_() {
      this.c = this.ds().c * 0.05;
      this.d = this.ds().d * 0.05;
      this.e = this.ds().e * 0.05;
   }
}
