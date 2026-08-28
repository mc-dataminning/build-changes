public class cpj extends buk implements cpn {
   private static final float a = 12.25F;
   private static final ajx<cwp> b = akb.a(cpj.class, ajz.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cpj(bur<? extends cpj> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpj(dgi $$0, double $$1, double $$2, double $$3) {
      this(bur.X, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cwp $$0) {
      if ($$0.f()) {
         this.au().a(b, this.m());
      } else {
         this.au().a(b, $$0.c(1));
      }
   }

   @Override
   public cwp l() {
      return this.au().a(b);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(b, this.m());
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cR().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(ji $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dB();
      double $$5 = $$3 - this.dH();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dB() + $$4 / $$6 * 12.0;
         this.e = this.dH() + $$5 / $$6 * 12.0;
         this.d = this.dD() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.ae.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.v((float)(ayz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(ayz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dM();
         this.O = this.dO();
      }
   }

   @Override
   public void h() {
      super.h();
      fba $$0 = this.dz();
      double $$1 = this.dB() + $$0.d;
      double $$2 = this.dD() + $$0.e;
      double $$3 = this.dH() + $$0.f;
      double $$4 = $$0.i();
      this.w(cpq.f(this.O, (float)(ayz.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(cpq.f(this.N, (float)(ayz.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dW().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ayz.d($$6, $$5);
         double $$9 = ayz.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dD() < this.d ? 1 : -1;
         $$0 = new fba(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.bj()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dW().a(lt.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dW()
            .a(lt.ae, $$1 - $$0.d * 0.25 + this.ae.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.ae.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dW().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dW().C) {
            this.a(awa.iC, 1.0F, 1.0F);
            this.at();
            if (this.g) {
               this.dW().b(new clb(this.dW(), this.dB(), this.dD(), this.dH(), this.l()));
            } else {
               this.dW().c(2003, this.dw(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Item", this.l().a(this.dY()));
   }

   @Override
   public void a(tq $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cwp.a(this.dY(), (un)$$0.p("Item")).orElse(this.m()));
      } else {
         this.a(this.m());
      }
   }

   private cwp m() {
      return new cwp(cwt.tp);
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      return false;
   }
}
