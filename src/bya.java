public class bya implements bxw {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bsc d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bya.a k = bya.a.a;

   public bya(bsc $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bya.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bya.a.d) {
         this.k = bya.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bya.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bya.a.c) {
         float $$0 = (float)this.d.g(bth.r);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = axz.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = axz.a(this.d.dD() * (float) (Math.PI / 180.0));
         float $$6 = axz.b(this.d.dD() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.y($$1);
         this.d.C(this.i);
         this.d.E(this.j);
         this.k = bya.a.a;
      } else if (this.k == bya.a.b) {
         this.k = bya.a.a;
         double $$9 = this.e - this.d.ds();
         double $$10 = this.g - this.d.dy();
         double $$11 = this.f - this.d.du();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.C(0.0F);
            return;
         }

         float $$13 = (float)(axz.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dD(), $$13, 90.0F));
         this.d.y((float)(this.h * this.d.g(bth.r)));
         in $$14 = this.d.dn();
         dqh $$15 = this.d.dN().a_($$14);
         eui $$16 = $$15.k(this.d.dN(), $$14);
         if ($$11 > (double)this.d.dH() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dh())
            || !$$16.c() && this.d.du() < $$16.c(is.a.b) + (double)$$14.v() && !$$15.a(avr.p) && !$$15.a(avr.S)) {
            this.d.I().a();
            this.k = bya.a.d;
         }
      } else if (this.k == bya.a.d) {
         this.d.y((float)(this.h * this.d.g(bth.r)));
         if (this.d.aC()) {
            this.k = bya.a.a;
         }
      } else {
         this.d.C(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cbl $$2 = this.d.K();
      if ($$2 != null) {
         emn $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d, in.a(this.d.ds() + (double)$$0, (double)this.d.dt(), this.d.dy() + (double)$$1)) != emr.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = axz.g($$1 - $$0);
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
