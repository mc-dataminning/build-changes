public class cee implements cea {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final byh d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cee.a k = cee.a.a;

   public cee(byh $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cee.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cee.a.d) {
         this.k = cee.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cee.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cee.a.c) {
         float $$0 = (float)this.d.h(bzl.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = azz.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = azz.a(this.d.dL() * (float) (Math.PI / 180.0));
         float $$6 = azz.b(this.d.dL() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.B($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cee.a.a;
      } else if (this.k == cee.a.b) {
         this.k = cee.a.a;
         double $$9 = this.e - this.d.dA();
         double $$10 = this.g - this.d.dG();
         double $$11 = this.f - this.d.dC();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(azz.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.w(this.b(this.d.dL(), $$13, 90.0F));
         this.d.B((float)(this.h * this.d.h(bzl.v)));
         iw $$14 = this.d.dv();
         ebq $$15 = this.d.dV().a_($$14);
         fgw $$16 = $$15.g(this.d.dV(), $$14);
         if ($$11 > (double)this.d.dP() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dq())
            || !$$16.c() && this.d.dC() < $$16.c(jc.a.b) + (double)$$14.v() && !$$15.a(axn.q) && !$$15.a(axn.U)) {
            this.d.M().a();
            this.k = cee.a.d;
         }
      } else if (this.k == cee.a.d) {
         this.d.B((float)(this.h * this.d.h(bzl.v)));
         if (this.d.aH() || this.d.bl() && this.d.em()) {
            this.k = cee.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      chp $$2 = this.d.N();
      if ($$2 != null) {
         eyn $$3 = $$2.n();
         if ($$3 != null && $$3.a(this.d, iw.a(this.d.dA() + (double)$$0, (double)this.d.dB(), this.d.dG() + (double)$$1)) != eyr.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = azz.h($$1 - $$0);
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
