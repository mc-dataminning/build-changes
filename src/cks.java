import javax.annotation.Nullable;

public abstract class cks extends cld {
   public double b;
   public double c;
   public double d;

   protected cks(bqr<? extends cks> $$0, czu $$1) {
      super($$0, $$1);
   }

   protected cks(bqr<? extends cks> $$0, double $$1, double $$2, double $$3, czu $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cks(bqr<? extends cks> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, czu $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dD(), this.dF());
      this.ar();
      this.q($$4, $$5, $$6);
   }

   public cks(bqr<? extends cks> $$0, bre $$1, double $$2, double $$3, double $$4, czu $$5) {
      this($$0, $$1.ds(), $$1.du(), $$1.dy(), $$2, $$3, $$4, $$5);
      this.c($$1);
      this.a($$1.dD(), $$1.dF());
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cI().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected czd.a af_() {
      return czd.a.a;
   }

   @Override
   public void l() {
      bql $$0 = this.u();
      if (this.dN().B || ($$0 == null || !$$0.dI()) && this.dN().B(this.dn())) {
         super.l();
         if (this.r()) {
            this.g(1);
         }

         etd $$1 = clf.a(this, this::b, this.af_());
         if ($$1.c() != etd.a.a) {
            this.a($$1);
         }

         this.aQ();
         etf $$2 = this.dq();
         double $$3 = this.ds() + $$2.c;
         double $$4 = this.du() + $$2.d;
         double $$5 = this.dy() + $$2.e;
         clf.a(this, 0.2F);
         float $$8;
         if (this.bc()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dN().a(kw.d, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.x();
         } else {
            $$8 = this.w();
         }

         this.g($$2.b(this.b, this.c, this.d).a((double)$$8));
         ku $$10 = this.v();
         if ($$10 != null) {
            this.dN().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.am();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.q($$0, $$1, $$2);
   }

   @Override
   protected boolean b(bql $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   protected boolean r() {
      return true;
   }

   @Nullable
   protected ku v() {
      return kw.ab;
   }

   protected float w() {
      return 0.95F;
   }

   protected float x() {
      return 0.8F;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         ue $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public float bI() {
      return 1.0F;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bt();
         bql $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dN().B) {
               etf $$3 = $$2.bJ();
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
   public float br() {
      return 1.0F;
   }

   @Override
   public yz<abk> dj() {
      bql $$0 = this.u();
      int $$1 = $$0 == null ? 0 : $$0.aj();
      return new abl(this.aj(), this.cx(), this.ds(), this.du(), this.dy(), this.dF(), this.dD(), this.ai(), $$1, new etf(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(abl $$0) {
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
