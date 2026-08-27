public class bre implements bra {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bli d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bre.a k = bre.a.a;

   public bre(bli $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bre.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bre.a.d) {
         this.k = bre.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bre.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bre.a.c) {
         float $$0 = (float)this.d.b(bmm.m);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = atm.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = atm.a(this.d.dD() * (float) (Math.PI / 180.0));
         float $$6 = atm.b(this.d.dD() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.w($$1);
         this.d.A(this.i);
         this.d.C(this.j);
         this.k = bre.a.a;
      } else if (this.k == bre.a.b) {
         this.k = bre.a.a;
         double $$9 = this.e - this.d.ds();
         double $$10 = this.g - this.d.dy();
         double $$11 = this.f - this.d.du();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.A(0.0F);
            return;
         }

         float $$13 = (float)(atm.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dD(), $$13, 90.0F));
         this.d.w((float)(this.h * this.d.b(bmm.m)));
         ht $$14 = this.d.dn();
         dhi $$15 = this.d.dN().a_($$14);
         ekn $$16 = $$15.k(this.d.dN(), $$14);
         if ($$11 > (double)this.d.dH() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dh())
            || !$$16.c() && this.d.du() < $$16.c(hx.a.b) + (double)$$14.v() && !$$15.a(arg.p) && !$$15.a(arg.S)) {
            this.d.M().a();
            this.k = bre.a.d;
         }
      } else if (this.k == bre.a.d) {
         this.d.w((float)(this.h * this.d.b(bmm.m)));
         if (this.d.aC()) {
            this.k = bre.a.a;
         }
      } else {
         this.d.A(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      bup $$2 = this.d.N();
      if ($$2 != null) {
         edg $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d.dN(), atm.a(this.d.ds() + (double)$$0), this.d.dt(), atm.a(this.d.dy() + (double)$$1)) != edd.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = atm.g($$1 - $$0);
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
