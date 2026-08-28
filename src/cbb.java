public class cbb implements cax {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bvc d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cbb.a k = cbb.a.a;

   public cbb(bvc $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cbb.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cbb.a.d) {
         this.k = cbb.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cbb.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cbb.a.c) {
         float $$0 = (float)this.d.h(bwi.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = azk.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = azk.a(this.d.dN() * (float) (Math.PI / 180.0));
         float $$6 = azk.b(this.d.dN() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.C($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cbb.a.a;
      } else if (this.k == cbb.a.b) {
         this.k = cbb.a.a;
         double $$9 = this.e - this.d.dC();
         double $$10 = this.g - this.d.dI();
         double $$11 = this.f - this.d.dE();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(azk.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.v(this.b(this.d.dN(), $$13, 90.0F));
         this.d.C((float)(this.h * this.d.h(bwi.v)));
         jh $$14 = this.d.dx();
         dvj $$15 = this.d.dX().a_($$14);
         fah $$16 = $$15.g(this.d.dX(), $$14);
         if ($$11 > (double)this.d.dR() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.ds())
            || !$$16.c() && this.d.dE() < $$16.c(jm.a.b) + (double)$$14.v() && !$$15.a(axa.q) && !$$15.a(axa.T)) {
            this.d.O().a();
            this.k = cbb.a.d;
         }
      } else if (this.k == cbb.a.d) {
         this.d.C((float)(this.h * this.d.h(bwi.v)));
         if (this.d.aK()) {
            this.k = cbb.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cem $$2 = this.d.P();
      if ($$2 != null) {
         erx $$3 = $$2.p();
         if ($$3 != null && $$3.a(this.d, jh.a(this.d.dC() + (double)$$0, (double)this.d.dD(), this.d.dI() + (double)$$1)) != esb.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = azk.h($$1 - $$0);
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
