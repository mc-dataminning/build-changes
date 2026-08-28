public class cch implements ccd {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bwi d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cch.a k = cch.a.a;

   public cch(bwi $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cch.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cch.a.d) {
         this.k = cch.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cch.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cch.a.c) {
         float $$0 = (float)this.d.h(bxo.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = bae.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = bae.a(this.d.dM() * (float) (Math.PI / 180.0));
         float $$6 = bae.b(this.d.dM() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.C($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cch.a.a;
      } else if (this.k == cch.a.b) {
         this.k = cch.a.a;
         double $$9 = this.e - this.d.dB();
         double $$10 = this.g - this.d.dH();
         double $$11 = this.f - this.d.dD();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(bae.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.v(this.b(this.d.dM(), $$13, 90.0F));
         this.d.C((float)(this.h * this.d.h(bxo.v)));
         jh $$14 = this.d.dw();
         dxv $$15 = this.d.dW().a_($$14);
         fcs $$16 = $$15.g(this.d.dW(), $$14);
         if ($$11 > (double)this.d.dQ() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dr())
            || !$$16.c() && this.d.dD() < $$16.c(jm.a.b) + (double)$$14.v() && !$$15.a(axu.q) && !$$15.a(axu.U)) {
            this.d.J().a();
            this.k = cch.a.d;
         }
      } else if (this.k == cch.a.d) {
         this.d.C((float)(this.h * this.d.h(bxo.v)));
         if (this.d.aJ()) {
            this.k = cch.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cfs $$2 = this.d.L();
      if ($$2 != null) {
         euk $$3 = $$2.p();
         if ($$3 != null && $$3.a(this.d, jh.a(this.d.dB() + (double)$$0, (double)this.d.dC(), this.d.dH() + (double)$$1)) != euo.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = bae.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      float $$4 = $$0 + $$3;
      if ($$4 < 0.0F) {
         $$4 += 360.0F;
      } else if ($$4 > 360.0F) {
         $$4 -= 360.0F;
      }

      return $$4;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public double f() {
      return this.g;
   }

   protected static enum a {
      a,
      b,
      c,
      d;
   }
}
