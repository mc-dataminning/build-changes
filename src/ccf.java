public class ccf extends biq implements ccj {
   private static final aef<cjf> b = aei.a(ccf.class, aeh.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public ccf(biu<? extends ccf> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccf(cpv $$0, double $$1, double $$2, double $$3) {
      this(biu.K, $$0);
      this.e($$1, $$2, $$3);
   }

   public void a(cjf $$0) {
      if (!$$0.a(cji.rD) || $$0.u()) {
         this.am().b(b, $$0.c(1));
      }
   }

   private cjf s() {
      return this.am().b(b);
   }

   @Override
   public cjf q() {
      cjf $$0 = this.s();
      return $$0.b() ? new cjf(cji.rD) : $$0;
   }

   @Override
   protected void a_() {
      this.am().a(b, cjf.b);
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

   public void a(gw $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dq();
      double $$5 = $$3 - this.dw();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dq() + $$4 / $$6 * 12.0;
         this.e = this.dw() + $$5 / $$6 * 12.0;
         this.d = this.ds() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.ag.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.r((float)(arx.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(arx.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dB();
         this.O = this.dD();
      }
   }

   @Override
   public void l() {
      super.l();
      ehn $$0 = this.do();
      double $$1 = this.dq() + $$0.c;
      double $$2 = this.ds() + $$0.d;
      double $$3 = this.dw() + $$0.e;
      double $$4 = $$0.h();
      this.s(ccm.d(this.O, (float)(arx.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(ccm.d(this.N, (float)(arx.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dL().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)arx.d($$6, $$5);
         double $$9 = arx.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.ds() < this.d ? 1 : -1;
         $$0 = new ehn(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.f($$0);
      }

      float $$12 = 0.25F;
      if (this.aY()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dL().a(ix.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dL()
            .a(ix.X, $$1 - $$0.c * 0.25 + this.ag.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ag.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dL().B) {
         this.e($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dL().B) {
            this.a(ape.ha, 1.0F, 1.0F);
            this.al();
            if (this.g) {
               this.dL().b(new byn(this.dL(), this.dq(), this.ds(), this.dw(), this.q()));
            } else {
               this.dL().c(2003, this.dl(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(qx $$0) {
      cjf $$1 = this.s();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qx()));
      }
   }

   @Override
   public void a(qx $$0) {
      cjf $$1 = cjf.a($$0.p("Item"));
      this.a($$1);
   }

   @Override
   public float bn() {
      return 1.0F;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
