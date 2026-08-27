public class bpk implements bpg {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bjo d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bpk.a k = bpk.a.a;

   public bpk(bjo $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bpk.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bpk.a.d) {
         this.k = bpk.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bpk.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bpk.a.c) {
         float $$0 = (float)this.d.b(bks.m);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = asb.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = asb.a(this.d.dB() * (float) (Math.PI / 180.0));
         float $$6 = asb.b(this.d.dB() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.w($$1);
         this.d.A(this.i);
         this.d.C(this.j);
         this.k = bpk.a.a;
      } else if (this.k == bpk.a.b) {
         this.k = bpk.a.a;
         double $$9 = this.e - this.d.dq();
         double $$10 = this.g - this.d.dw();
         double $$11 = this.f - this.d.ds();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.A(0.0F);
            return;
         }

         float $$13 = (float)(asb.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dB(), $$13, 90.0F));
         this.d.w((float)(this.h * this.d.b(bks.m)));
         gw $$14 = this.d.dl();
         dfd $$15 = this.d.dL().a_($$14);
         eia $$16 = $$15.k(this.d.dL(), $$14);
         if ($$11 > (double)this.d.dF() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.df())
            || !$$16.c() && this.d.ds() < $$16.c(ha.a.b) + (double)$$14.v() && !$$15.a(apv.p) && !$$15.a(apv.S)) {
            this.d.K().a();
            this.k = bpk.a.d;
         }
      } else if (this.k == bpk.a.d) {
         this.d.w((float)(this.h * this.d.b(bks.m)));
         if (this.d.aA()) {
            this.k = bpk.a.a;
         }
      } else {
         this.d.A(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      bsv $$2 = this.d.L();
      if ($$2 != null) {
         eau $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d.dL(), asb.a(this.d.dq() + (double)$$0), this.d.dr(), asb.a(this.d.dw() + (double)$$1)) != ear.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = asb.g($$1 - $$0);
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
