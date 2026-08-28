import javax.annotation.Nullable;

public abstract class cnf extends cnq {
   public static final double b = 0.1;
   public static final double c = 0.05;
   public double d;
   public double e;
   public double f;

   protected cnf(btb<? extends cnf> $$0, dbz $$1) {
      super($$0, $$1);
   }

   protected cnf(btb<? extends cnf> $$0, double $$1, double $$2, double $$3, dbz $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cnf(btb<? extends cnf> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbz $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dF(), this.dH());
      this.at();
      this.q($$4, $$5, $$6);
   }

   public cnf(btb<? extends cnf> $$0, btq $$1, double $$2, double $$3, double $$4, dbz $$5) {
      this($$0, $$1.du(), $$1.dw(), $$1.dA(), $$2, $$3, $$4, $$5);
      this.c($$1);
      this.a($$1.dF(), $$1.dH());
   }

   @Override
   protected void a(ako.a $$0) {
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

   protected dbi.a af_() {
      return dbi.a.a;
   }

   @Override
   public void l() {
      bsv $$0 = this.s();
      if (this.dP().B || ($$0 == null || !$$0.dK()) && this.dP().B(this.dp())) {
         super.l();
         if (this.u()) {
            this.g(1);
         }

         evq $$1 = cns.a(this, this::b, this.af_());
         if ($$1.c() != evq.a.a) {
            this.b($$1);
         }

         this.aS();
         evs $$2 = this.ds();
         double $$3 = this.du() + $$2.c;
         double $$4 = this.dw() + $$2.d;
         double $$5 = this.dA() + $$2.e;
         cns.a(this, 0.2F);
         float $$8;
         if (this.be()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dP().a(li.d, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.x();
         } else {
            $$8 = this.w();
         }

         this.h($$2.b(this.d, this.e, this.f).a((double)$$8));
         lg $$10 = this.v();
         if ($$10 != null) {
            this.dP().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.ao();
      }
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      return !this.b($$0);
   }

   @Override
   protected boolean b(bsv $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   protected boolean u() {
      return true;
   }

   @Nullable
   protected lg v() {
      return li.ae;
   }

   protected float w() {
      return 0.95F;
   }

   protected float x() {
      return 0.8F;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.d, this.e, this.f}));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         uy $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.d = $$1.h(0);
            this.e = $$1.h(1);
            this.f = $$1.h(2);
         }
      }
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   public zw<aci> dl() {
      bsv $$0 = this.s();
      int $$1 = $$0 == null ? 0 : $$0.al();
      return new acj(this.al(), this.cz(), this.du(), this.dw(), this.dA(), this.dH(), this.dF(), this.ak(), $$1, new evs(this.d, this.e, this.f), 0.0);
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.q($$1, $$2, $$3);
   }

   private void q(double $$0, double $$1, double $$2) {
      double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      if ($$3 != 0.0) {
         this.d = $$0 / $$3 * 0.1;
         this.e = $$1 / $$3 * 0.1;
         this.f = $$2 / $$3 * 0.1;
      }
   }

   @Override
   protected void b(@Nullable bsv $$0, boolean $$1) {
      super.b($$0, $$1);
      if ($$1) {
         this.d = this.ds().c * 0.1;
         this.e = this.ds().d * 0.1;
         this.f = this.ds().e * 0.1;
      } else {
         this.d = this.ds().c * 0.05;
         this.e = this.ds().d * 0.05;
         this.f = this.ds().e * 0.05;
      }
   }
}
