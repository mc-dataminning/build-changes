public class bsn implements bsj {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bmq d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bsn.a k = bsn.a.a;

   public bsn(bmq $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bsn.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bsn.a.d) {
         this.k = bsn.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bsn.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bsn.a.c) {
         float $$0 = (float)this.d.g(bnu.o);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = aup.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = aup.a(this.d.dB() * (float) (Math.PI / 180.0));
         float $$6 = aup.b(this.d.dB() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.v($$1);
         this.d.z(this.i);
         this.d.B(this.j);
         this.k = bsn.a.a;
      } else if (this.k == bsn.a.b) {
         this.k = bsn.a.a;
         double $$9 = this.e - this.d.dq();
         double $$10 = this.g - this.d.dw();
         double $$11 = this.f - this.d.ds();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.z(0.0F);
            return;
         }

         float $$13 = (float)(aup.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dB(), $$13, 90.0F));
         this.d.v((float)(this.h * this.d.g(bnu.o)));
         hx $$14 = this.d.dl();
         djp $$15 = this.d.dL().a_($$14);
         emv $$16 = $$15.k(this.d.dL(), $$14);
         if ($$11 > (double)this.d.dF() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dg())
            || !$$16.c() && this.d.ds() < $$16.c(ic.a.b) + (double)$$14.v() && !$$15.a(asi.p) && !$$15.a(asi.S)) {
            this.d.M().a();
            this.k = bsn.a.d;
         }
      } else if (this.k == bsn.a.d) {
         this.d.v((float)(this.h * this.d.g(bnu.o)));
         if (this.d.aC()) {
            this.k = bsn.a.a;
         }
      } else {
         this.d.z(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      bvy $$2 = this.d.N();
      if ($$2 != null) {
         efn $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d.dL(), aup.a(this.d.dq() + (double)$$0), this.d.dr(), aup.a(this.d.dw() + (double)$$1)) != efk.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = aup.g($$1 - $$0);
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
