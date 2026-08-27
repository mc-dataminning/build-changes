public class bvo implements bvk {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bpq d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bvo.a k = bvo.a.a;

   public bvo(bpq $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bvo.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bvo.a.d) {
         this.k = bvo.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bvo.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bvo.a.c) {
         float $$0 = (float)this.d.g(bqv.r);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = aww.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = aww.a(this.d.dC() * (float) (Math.PI / 180.0));
         float $$6 = aww.b(this.d.dC() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.y($$1);
         this.d.C(this.i);
         this.d.E(this.j);
         this.k = bvo.a.a;
      } else if (this.k == bvo.a.b) {
         this.k = bvo.a.a;
         double $$9 = this.e - this.d.dr();
         double $$10 = this.g - this.d.dx();
         double $$11 = this.f - this.d.dt();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.C(0.0F);
            return;
         }

         float $$13 = (float)(aww.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dC(), $$13, 90.0F));
         this.d.y((float)(this.h * this.d.g(bqv.r)));
         ib $$14 = this.d.dm();
         dmz $$15 = this.d.dM().a_($$14);
         eqk $$16 = $$15.k(this.d.dM(), $$14);
         if ($$11 > (double)this.d.dG() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dg())
            || !$$16.c() && this.d.dt() < $$16.c(ih.a.b) + (double)$$14.v() && !$$15.a(aun.p) && !$$15.a(aun.S)) {
            this.d.I().a();
            this.k = bvo.a.d;
         }
      } else if (this.k == bvo.a.d) {
         this.d.y((float)(this.h * this.d.g(bqv.r)));
         if (this.d.aC()) {
            this.k = bvo.a.a;
         }
      } else {
         this.d.C(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      byz $$2 = this.d.K();
      if ($$2 != null) {
         ejb $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d.dM(), aww.a(this.d.dr() + (double)$$0), this.d.ds(), aww.a(this.d.dx() + (double)$$1)) != eiy.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = aww.g($$1 - $$0);
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
