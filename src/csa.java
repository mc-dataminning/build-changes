public class csa extends bwi implements cse {
   private static final float a = 12.25F;
   private static final akj<czn> b = akn.a(csa.class, akl.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public csa(bwr<? extends csa> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csa(djm $$0, double $$1, double $$2, double $$3) {
      this(bwr.W, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(czn $$0) {
      if ($$0.f()) {
         this.ar().a(b, this.g());
      } else {
         this.ar().a(b, $$0.c(1));
      }
   }

   @Override
   public czn f() {
      return this.ar().a(b);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(b, this.g());
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cQ().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(iv $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dz();
      double $$5 = $$3 - this.dF();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dz() + $$4 / $$6 * 12.0;
         this.e = this.dF() + $$5 / $$6 * 12.0;
         this.d = this.dB() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.ae.a(5) > 0;
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azm.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.x((float)(azm.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dK();
         this.O = this.dM();
      }
   }

   @Override
   public void h() {
      super.h();
      ffc $$0 = this.dx();
      double $$1 = this.dz() + $$0.d;
      double $$2 = this.dB() + $$0.e;
      double $$3 = this.dF() + $$0.f;
      double $$4 = $$0.i();
      this.x(csh.f(this.O, (float)(azm.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.w(csh.f(this.N, (float)(azm.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dU().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azm.d($$6, $$5);
         double $$9 = azm.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dB() < this.d ? 1 : -1;
         $$0 = new ffc(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.i($$0);
      }

      float $$12 = 0.25F;
      if (this.bh()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dU().a(ly.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dU()
            .a(ly.af, $$1 - $$0.d * 0.25 + this.ae.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.ae.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dU().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dU().C) {
            this.a(awn.iF, 1.0F, 1.0F);
            this.aq();
            if (this.g) {
               this.dU().b(new cnr(this.dU(), this.dz(), this.dB(), this.dF(), this.f()));
            } else {
               this.dU().c(2003, this.du(), 0);
            }
         }
      } else {
         this.a_($$1, $$2, $$3);
      }
   }

   @Override
   public void b(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("Item", czn.b, $$1, this.f());
   }

   @Override
   public void a(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<czn>a("Item", czn.b, $$1).orElse(this.g()));
   }

   private czn g() {
      return new czn(czr.tA);
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }
}
