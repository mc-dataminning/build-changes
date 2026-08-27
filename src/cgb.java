public class cgb extends blw implements cgf {
   private static final agn<cng> b = agq.a(cgb.class, agp.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cgb(bmc<? extends cgb> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgb(ctx $$0, double $$1, double $$2, double $$3) {
      this(bmc.M, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cng $$0) {
      if (!$$0.a(cnj.sr) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   private cng s() {
      return this.an().b(b);
   }

   @Override
   public cng q() {
      cng $$0 = this.s();
      return $$0.b() ? new cng(cnj.sr) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cng.f);
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

   public void a(hx $$0) {
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
         this.r((float)(aup.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(aup.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dB();
         this.O = this.dD();
      }
   }

   @Override
   public void l() {
      super.l();
      emc $$0 = this.do();
      double $$1 = this.dq() + $$0.c;
      double $$2 = this.ds() + $$0.d;
      double $$3 = this.dw() + $$0.e;
      double $$4 = $$0.h();
      this.s(cgi.d(this.O, (float)(aup.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cgi.d(this.N, (float)(aup.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dL().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)aup.d($$6, $$5);
         double $$9 = aup.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.ds() < this.d ? 1 : -1;
         $$0 = new emc(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.g($$0);
      }

      float $$12 = 0.25F;
      if (this.aZ()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dL().a(jx.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dL()
            .a(jx.Z, $$1 - $$0.c * 0.25 + this.ag.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ag.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dL().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dL().B) {
            this.a(art.hS, 1.0F, 1.0F);
            this.am();
            if (this.g) {
               this.dL().b(new ccb(this.dL(), this.dq(), this.ds(), this.dw(), this.q()));
            } else {
               this.dL().c(2003, this.dl(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(so $$0) {
      cng $$1 = this.s();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new so()));
      }
   }

   @Override
   public void a(so $$0) {
      cng $$1 = cng.a($$0.p("Item"));
      this.a($$1);
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
