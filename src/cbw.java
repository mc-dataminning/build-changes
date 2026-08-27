public abstract class cbw extends cch {
   public double b;
   public double c;
   public double d;

   protected cbw(bip<? extends cbw> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cbw(bip<? extends cbw> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cpq $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dA(), this.dC());
      this.ap();
      double $$8 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
      if ($$8 != 0.0) {
         this.b = $$4 / $$8 * 0.1;
         this.c = $$5 / $$8 * 0.1;
         this.d = $$6 / $$8 * 0.1;
      }
   }

   public cbw(bip<? extends cbw> $$0, bjb $$1, double $$2, double $$3, double $$4, cpq $$5) {
      this($$0, $$1.dp(), $$1.dr(), $$1.dv(), $$2, $$3, $$4, $$5);
      this.b($$1);
      this.a($$1.dA(), $$1.dC());
   }

   @Override
   protected void a_() {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      bil $$0 = this.v();
      if (this.dK().B || ($$0 == null || !$$0.dF()) && this.dK().A(this.dk())) {
         super.l();
         if (this.Z_()) {
            this.g(1);
         }

         ehg $$1 = cci.a(this, this::a);
         if ($$1.c() != ehg.a.a) {
            this.a($$1);
         }

         this.aO();
         ehi $$2 = this.dn();
         double $$3 = this.dp() + $$2.c;
         double $$4 = this.dr() + $$2.d;
         double $$5 = this.dv() + $$2.e;
         cci.a(this, 0.2F);
         float $$6 = this.o();
         if (this.aX()) {
            for (int $$7 = 0; $$7 < 4; $$7++) {
               float $$8 = 0.25F;
               this.dK().a(ix.e, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$6 = 0.8F;
         }

         this.f($$2.b(this.b, this.c, this.d).a((double)$$6));
         this.dK().a(this.m(), $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         this.e($$3, $$4, $$5);
      } else {
         this.ak();
      }
   }

   @Override
   protected boolean a(bil $$0) {
      return super.a($$0) && !$$0.af;
   }

   protected boolean Z_() {
      return true;
   }

   protected iv m() {
      return ix.Z;
   }

   protected float o() {
      return 0.95F;
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         ra $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public float bD() {
      return 1.0F;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bo();
         bil $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dK().B) {
               ehi $$3 = $$2.bE();
               this.f($$3);
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
   public float bm() {
      return 1.0F;
   }

   @Override
   public va<ws> U() {
      bil $$0 = this.v();
      int $$1 = $$0 == null ? 0 : $$0.ah();
      return new wt(this.ah(), this.cv(), this.dp(), this.dr(), this.dv(), this.dC(), this.dA(), this.ag(), $$1, new ehi(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(wt $$0) {
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
