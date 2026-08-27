public class bow implements bos {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bja d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bow.a k = bow.a.a;

   public bow(bja $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bow.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bow.a.d) {
         this.k = bow.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bow.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bow.a.c) {
         float $$0 = (float)this.d.b(bke.d);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = arp.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = arp.a(this.d.dA() * (float) (Math.PI / 180.0));
         float $$6 = arp.b(this.d.dA() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.w($$1);
         this.d.A(this.i);
         this.d.C(this.j);
         this.k = bow.a.a;
      } else if (this.k == bow.a.b) {
         this.k = bow.a.a;
         double $$9 = this.e - this.d.dp();
         double $$10 = this.g - this.d.dv();
         double $$11 = this.f - this.d.dr();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.A(0.0F);
            return;
         }

         float $$13 = (float)(arp.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.r(this.a(this.d.dA(), $$13, 90.0F));
         this.d.w((float)(this.h * this.d.b(bke.d)));
         gu $$14 = this.d.dk();
         dez $$15 = this.d.dK().a_($$14);
         ehw $$16 = $$15.k(this.d.dK(), $$14);
         if ($$11 > (double)this.d.dE() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.df())
            || !$$16.c() && this.d.dr() < $$16.c(ha.a.b) + (double)$$14.v() && !$$15.a(apl.p) && !$$15.a(apl.S)) {
            this.d.F().a();
            this.k = bow.a.d;
         }
      } else if (this.k == bow.a.d) {
         this.d.w((float)(this.h * this.d.b(bke.d)));
         if (this.d.aA()) {
            this.k = bow.a.a;
         }
      } else {
         this.d.A(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      bsh $$2 = this.d.H();
      if ($$2 != null) {
         eaq $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d.dK(), arp.a(this.d.dp() + (double)$$0), this.d.dq(), arp.a(this.d.dv() + (double)$$1)) != ean.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = arp.g($$1 - $$0);
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
