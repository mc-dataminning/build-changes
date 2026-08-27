public class cdx extends bki implements ceb {
   private static final afm<clb> b = afp.a(cdx.class, afo.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cdx(bkm<? extends cdx> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cdx(crs $$0, double $$1, double $$2, double $$3) {
      this(bkm.K, $$0);
      this.e($$1, $$2, $$3);
   }

   public void a(clb $$0) {
      if (!$$0.a(cle.rE) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   private clb s() {
      return this.al().b(b);
   }

   @Override
   public clb q() {
      clb $$0 = this.s();
      return $$0.b() ? new clb(cle.rE) : $$0;
   }

   @Override
   protected void b_() {
      this.al().a(b, clb.b);
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

   public void a(ht $$0) {
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
         this.r((float)(ati.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(ati.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dB();
         this.O = this.dD();
      }
   }

   @Override
   public void l() {
      super.l();
      eji $$0 = this.do();
      double $$1 = this.dq() + $$0.c;
      double $$2 = this.ds() + $$0.d;
      double $$3 = this.dw() + $$0.e;
      double $$4 = $$0.h();
      this.s(cee.d(this.O, (float)(ati.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cee.d(this.N, (float)(ati.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dL().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ati.d($$6, $$5);
         double $$9 = ati.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.ds() < this.d ? 1 : -1;
         $$0 = new eji(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.f($$0);
      }

      float $$12 = 0.25F;
      if (this.aX()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dL().a(js.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dL()
            .a(js.X, $$1 - $$0.c * 0.25 + this.ag.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ag.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dL().B) {
         this.e($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dL().B) {
            this.a(aqn.he, 1.0F, 1.0F);
            this.ak();
            if (this.g) {
               this.dL().b(new caf(this.dL(), this.dq(), this.ds(), this.dw(), this.q()));
            } else {
               this.dL().c(2003, this.dl(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(rz $$0) {
      clb $$1 = this.s();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      clb $$1 = clb.a($$0.p("Item"));
      this.a($$1);
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   public boolean cp() {
      return false;
   }
}
