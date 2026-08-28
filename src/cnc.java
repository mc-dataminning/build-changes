import javax.annotation.Nullable;

public abstract class cnc extends cnn {
   public static final double b = 0.05;
   public double c;
   public double d;
   public double e;

   protected cnc(bsy<? extends cnc> $$0, dbw $$1) {
      super($$0, $$1);
   }

   protected cnc(bsy<? extends cnc> $$0, double $$1, double $$2, double $$3, dbw $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cnc(bsy<? extends cnc> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbw $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dF(), this.dH());
      this.at();
      this.q($$4, $$5, $$6);
   }

   public cnc(bsy<? extends cnc> $$0, btn $$1, double $$2, double $$3, double $$4, dbw $$5) {
      this($$0, $$1.du(), $$1.dw(), $$1.dA(), $$2, $$3, $$4, $$5);
      this.c($$1);
      this.a($$1.dF(), $$1.dH());
   }

   @Override
   protected void a(akn.a $$0) {
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

   protected dbf.a ag_() {
      return dbf.a.a;
   }

   @Override
   public void l() {
      bss $$0 = this.s();
      if (this.dP().B || ($$0 == null || !$$0.dK()) && this.dP().B(this.dp())) {
         super.l();
         if (this.u()) {
            this.g(1);
         }

         evn $$1 = cnp.a(this, this::b, this.ag_());
         if ($$1.c() != evn.a.a) {
            this.b($$1);
         }

         this.aS();
         evp $$2 = this.ds();
         double $$3 = this.du() + $$2.c;
         double $$4 = this.dw() + $$2.d;
         double $$5 = this.dA() + $$2.e;
         cnp.a(this, 0.2F);
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

         this.h($$2.b(this.c, this.d, this.e).a((double)$$8));
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
   protected boolean b(bss $$0) {
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
   protected void d(bss $$0) {
      evp $$1 = $$0.bL();
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
   public zv<ach> dl() {
      bss $$0 = this.s();
      int $$1 = $$0 == null ? 0 : $$0.al();
      return new aci(this.al(), this.cz(), this.du(), this.dw(), this.dA(), this.dH(), this.dF(), this.ak(), $$1, new evp(this.c, this.d, this.e), 0.0);
   }

   @Override
   public void a(aci $$0) {
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
