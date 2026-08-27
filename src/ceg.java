public abstract class ceg extends cer {
   public double b;
   public double c;
   public double d;

   protected ceg(bkz<? extends ceg> $$0, csf $$1) {
      super($$0, $$1);
   }

   public ceg(bkz<? extends ceg> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, csf $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dD(), this.dF());
      this.ar();
      double $$8 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
      if ($$8 != 0.0) {
         this.b = $$4 / $$8 * 0.1;
         this.c = $$5 / $$8 * 0.1;
         this.d = $$6 / $$8 * 0.1;
      }
   }

   public ceg(bkz<? extends ceg> $$0, bll $$1, double $$2, double $$3, double $$4, csf $$5) {
      this($$0, $$1.ds(), $$1.du(), $$1.dy(), $$2, $$3, $$4, $$5);
      this.b($$1);
      this.a($$1.dD(), $$1.dF());
   }

   @Override
   protected void c_() {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      bkv $$0 = this.w();
      if (this.dN().B || ($$0 == null || !$$0.dI()) && this.dN().A(this.dn())) {
         super.l();
         if (this.ag_()) {
            this.g(1);
         }

         ejx $$1 = ces.a(this, this::a);
         if ($$1.c() != ejx.a.a) {
            this.a($$1);
         }

         this.aQ();
         ejz $$2 = this.dq();
         double $$3 = this.ds() + $$2.c;
         double $$4 = this.du() + $$2.d;
         double $$5 = this.dy() + $$2.e;
         ces.a(this, 0.2F);
         float $$6 = this.u();
         if (this.aZ()) {
            for (int $$7 = 0; $$7 < 4; $$7++) {
               float $$8 = 0.25F;
               this.dN().a(jw.e, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$6 = 0.8F;
         }

         this.g($$2.b(this.b, this.c, this.d).a((double)$$6));
         this.dN().a(this.s(), $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         this.a_($$3, $$4, $$5);
      } else {
         this.am();
      }
   }

   @Override
   protected boolean a(bkv $$0) {
      return super.a($$0) && !$$0.af;
   }

   protected boolean ag_() {
      return true;
   }

   protected ju s() {
      return jw.Z;
   }

   protected float u() {
      return 0.95F;
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         sj $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public float bE() {
      return 1.0F;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         bkv $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dN().B) {
               ejz $$3 = $$2.bF();
               this.g($$3);
               this.b = $$3.c * 0.1;
               this.c = $$3.d * 0.1;
               this.d = $$3.e * 0.1;
               this.b($$2);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public wo<yh> dk() {
      bkv $$0 = this.w();
      int $$1 = $$0 == null ? 0 : $$0.aj();
      return new yi(this.aj(), this.cw(), this.ds(), this.du(), this.dy(), this.dF(), this.dD(), this.ai(), $$1, new ejz(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
      if ($$4 != 0.0) {
         this.b = $$1 / $$4 * 0.1;
         this.c = $$2 / $$4 * 0.1;
         this.d = $$3 / $$4 * 0.1;
      }
   }
}
