public abstract class byv extends bzg {
   public double b;
   public double c;
   public double d;

   protected byv(bfn<? extends byv> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public byv(bfn<? extends byv> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cmm $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dy(), this.dA());
      this.an();
      double $$8 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
      if ($$8 != 0.0) {
         this.b = $$4 / $$8 * 0.1;
         this.c = $$5 / $$8 * 0.1;
         this.d = $$6 / $$8 * 0.1;
      }
   }

   public byv(bfn<? extends byv> $$0, bfz $$1, double $$2, double $$3, double $$4, cmm $$5) {
      this($$0, $$1.dn(), $$1.dp(), $$1.dt(), $$2, $$3, $$4, $$5);
      this.b($$1);
      this.a($$1.dy(), $$1.dA());
   }

   @Override
   protected void a_() {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      bfj $$0 = this.v();
      if (this.dI().B || ($$0 == null || !$$0.dD()) && this.dI().A(this.di())) {
         super.l();
         if (this.aa_()) {
            this.g(1);
         }

         eeg $$1 = bzh.a(this, this::a);
         if ($$1.c() != eeg.a.a) {
            this.a($$1);
         }

         this.aM();
         eei $$2 = this.dl();
         double $$3 = this.dn() + $$2.c;
         double $$4 = this.dp() + $$2.d;
         double $$5 = this.dt() + $$2.e;
         bzh.a(this, 0.2F);
         float $$6 = this.o();
         if (this.aV()) {
            for (int $$7 = 0; $$7 < 4; $$7++) {
               float $$8 = 0.25F;
               this.dI().a(iv.e, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$6 = 0.8F;
         }

         this.f($$2.b(this.b, this.c, this.d).a((double)$$6));
         this.dI().a(this.k(), $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         this.e($$3, $$4, $$5);
      } else {
         this.ai();
      }
   }

   @Override
   protected boolean a(bfj $$0) {
      return super.a($$0) && !$$0.ae;
   }

   protected boolean aa_() {
      return true;
   }

   protected it k() {
      return iv.Z;
   }

   protected float o() {
      return 0.95F;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         qx $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }
   }

   @Override
   public boolean bo() {
      return true;
   }

   @Override
   public float bC() {
      return 1.0F;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bl();
         bfj $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dI().B) {
               eei $$3 = $$2.bD();
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
   public float bj() {
      return 1.0F;
   }

   @Override
   public uo<ur> S() {
      bfj $$0 = this.v();
      int $$1 = $$0 == null ? 0 : $$0.af();
      return new us(this.af(), this.ct(), this.dn(), this.dp(), this.dt(), this.dA(), this.dy(), this.ae(), $$1, new eei(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      double $$1 = $$0.h();
      double $$2 = $$0.i();
      double $$3 = $$0.j();
      double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
      if ($$4 != 0.0) {
         this.b = $$1 / $$4 * 0.1;
         this.c = $$2 / $$4 * 0.1;
         this.d = $$3 / $$4 * 0.1;
      }
   }
}
