public class bpe implements bpa {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bji d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bpe.a k = bpe.a.a;

   public bpe(bji $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bpe.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bpe.a.d) {
         this.k = bpe.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bpe.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bpe.a.c) {
         float $$0 = (float)this.d.b(bkm.d);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = arx.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = arx.a(this.d.dB() * (float) (Math.PI / 180.0));
         float $$6 = arx.b(this.d.dB() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.w($$1);
         this.d.A(this.i);
         this.d.C(this.j);
         this.k = bpe.a.a;
      } else if (this.k == bpe.a.b) {
         this.k = bpe.a.a;
         double $$9 = this.e - this.d.dq();
         double $$10 = this.g - this.d.dw();
         double $$11 = this.f - this.d.ds();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.A(0.0F);
            return;
         }

         float $$13 = (float)(arx.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dB(), $$13, 90.0F));
         this.d.w((float)(this.h * this.d.b(bkm.d)));
         gw $$14 = this.d.dl();
         dfj $$15 = this.d.dL().a_($$14);
         eig $$16 = $$15.k(this.d.dL(), $$14);
         if ($$11 > (double)this.d.dF() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.df())
            || !$$16.c() && this.d.ds() < $$16.c(hc.a.b) + (double)$$14.v() && !$$15.a(apt.p) && !$$15.a(apt.S)) {
            this.d.K().a();
            this.k = bpe.a.d;
         }
      } else if (this.k == bpe.a.d) {
         this.d.w((float)(this.h * this.d.b(bkm.d)));
         if (this.d.aA()) {
            this.k = bpe.a.a;
         }
      } else {
         this.d.A(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      bsp $$2 = this.d.L();
      if ($$2 != null) {
         eba $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d.dL(), arx.a(this.d.dq() + (double)$$0), this.d.dr(), arx.a(this.d.dw() + (double)$$1)) != eax.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = arx.g($$1 - $$0);
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
