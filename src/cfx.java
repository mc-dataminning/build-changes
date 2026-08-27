import javax.annotation.Nullable;

public abstract class cfx extends cgi {
   public double b;
   public double c;
   public double d;

   protected cfx(bmc<? extends cfx> $$0, ctx $$1) {
      super($$0, $$1);
   }

   protected cfx(bmc<? extends cfx> $$0, double $$1, double $$2, double $$3, ctx $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cfx(bmc<? extends cfx> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ctx $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dB(), this.dD());
      this.ar();
      double $$8 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
      if ($$8 != 0.0) {
         this.b = $$4 / $$8 * 0.1;
         this.c = $$5 / $$8 * 0.1;
         this.d = $$6 / $$8 * 0.1;
      }
   }

   public cfx(bmc<? extends cfx> $$0, bmo $$1, double $$2, double $$3, double $$4, ctx $$5) {
      this($$0, $$1.dq(), $$1.ds(), $$1.dw(), $$2, $$3, $$4, $$5);
      this.c($$1);
      this.a($$1.dB(), $$1.dD());
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

   protected ctg.a ah_() {
      return ctg.a.a;
   }

   @Override
   public void l() {
      blw $$0 = this.w();
      if (this.dL().B || ($$0 == null || !$$0.dG()) && this.dL().B(this.dl())) {
         super.l();
         if (this.s()) {
            this.g(1);
         }

         ema $$1 = cgj.a(this, this::b, this.ah_());
         if ($$1.c() != ema.a.a) {
            this.a($$1);
         }

         this.aQ();
         emc $$2 = this.do();
         double $$3 = this.dq() + $$2.c;
         double $$4 = this.ds() + $$2.d;
         double $$5 = this.dw() + $$2.e;
         cgj.a(this, 0.2F);
         float $$8;
         if (this.aZ()) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               float $$7 = 0.25F;
               this.dL().a(jx.e, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$8 = this.y();
         } else {
            $$8 = this.x();
         }

         this.g($$2.b(this.b, this.c, this.d).a((double)$$8));
         jv $$10 = this.u();
         if ($$10 != null) {
            this.dL().a($$10, $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         }

         this.a_($$3, $$4, $$5);
      } else {
         this.am();
      }
   }

   @Override
   protected boolean b(blw $$0) {
      return super.b($$0) && !$$0.af;
   }

   @Override
   protected boolean s() {
      return true;
   }

   @Nullable
   protected jv u() {
      return jx.ab;
   }

   protected float x() {
      return 0.95F;
   }

   protected float y() {
      return 0.8F;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         su $$1 = $$0.c("power", 6);
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
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         blw $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dL().B) {
               emc $$3 = $$2.bF();
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
   public float bo() {
      return 1.0F;
   }

   @Override
   public xg<zb> di() {
      blw $$0 = this.w();
      int $$1 = $$0 == null ? 0 : $$0.aj();
      return new zc(this.aj(), this.cw(), this.dq(), this.ds(), this.dw(), this.dD(), this.dB(), this.ai(), $$1, new emc(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(zc $$0) {
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
