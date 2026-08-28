public class bzo implements bzk {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final btp d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bzo.a k = bzo.a.a;

   public bzo(btp $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bzo.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bzo.a.d) {
         this.k = bzo.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bzo.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bzo.a.c) {
         float $$0 = (float)this.d.g(buv.r);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = ayx.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = ayx.a(this.d.dF() * (float) (Math.PI / 180.0));
         float $$6 = ayx.b(this.d.dF() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.y($$1);
         this.d.C(this.i);
         this.d.E(this.j);
         this.k = bzo.a.a;
      } else if (this.k == bzo.a.b) {
         this.k = bzo.a.a;
         double $$9 = this.e - this.d.du();
         double $$10 = this.g - this.d.dA();
         double $$11 = this.f - this.d.dw();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.C(0.0F);
            return;
         }

         float $$13 = (float)(ayx.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dF(), $$13, 90.0F));
         this.d.y((float)(this.h * this.d.g(buv.r)));
         iz $$14 = this.d.dp();
         dsa $$15 = this.d.dP().a_($$14);
         ewi $$16 = $$15.k(this.d.dP(), $$14);
         if ($$11 > (double)this.d.dJ() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dj())
            || !$$16.c() && this.d.dw() < $$16.c(je.a.b) + (double)$$14.v() && !$$15.a(awo.p) && !$$15.a(awo.S)) {
            this.d.I().a();
            this.k = bzo.a.d;
         }
      } else if (this.k == bzo.a.d) {
         this.d.y((float)(this.h * this.d.g(buv.r)));
         if (this.d.aE()) {
            this.k = bzo.a.a;
         }
      } else {
         this.d.C(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      ccz $$2 = this.d.K();
      if ($$2 != null) {
         eog $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d, iz.a(this.d.du() + (double)$$0, (double)this.d.dv(), this.d.dA() + (double)$$1)) != eok.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ayx.g($$1 - $$0);
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
