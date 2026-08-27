public class fqa extends frt {
   private final double a;
   private final double b;
   private final double F;

   fqa(fnq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.a = $$1;
      this.b = $$2;
      this.F = $$3;
      this.d = $$1 + $$4;
      this.e = $$2 + $$5;
      this.f = $$3 + $$6;
      this.g = this.d;
      this.h = this.e;
      this.i = this.f;
      this.D = 0.1F * (this.r.i() * 0.5F + 0.2F);
      float $$7 = this.r.i() * 0.6F + 0.4F;
      this.v = 0.9F * $$7;
      this.w = 0.9F * $$7;
      this.x = $$7;
      this.n = false;
      this.t = (int)(Math.random() * 10.0) + 30;
   }

   @Override
   public fqx b() {
      return fqx.b;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.a(this.n().d($$0, $$1, $$2));
      this.l();
   }

   @Override
   public int a(float $$0) {
      int $$1 = super.a($$0);
      float $$2 = (float)this.s / (float)this.t;
      $$2 *= $$2;
      $$2 *= $$2;
      int $$3 = $$1 & 0xFF;
      int $$4 = $$1 >> 16 & 0xFF;
      $$4 += (int)($$2 * 15.0F * 16.0F);
      if ($$4 > 240) {
         $$4 = 240;
      }

      return $$3 | $$4 << 16;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         float $$0 = (float)this.s / (float)this.t;
         $$0 = 1.0F - $$0;
         float $$1 = 1.0F - $$0;
         $$1 *= $$1;
         $$1 *= $$1;
         this.g = this.a + this.j * (double)$$0;
         this.h = this.b + this.k * (double)$$0 - (double)($$1 * 1.2F);
         this.i = this.F + this.l * (double)$$0;
      }
   }

   public static class a implements fqw<ka> {
      private final fro a;

      public a(fro $$0) {
         this.a = $$0;
      }

      public fqt a(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fqa $$8 = new fqa($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b implements fqw<ka> {
      private final fro a;

      public b(fro $$0) {
         this.a = $$0;
      }

      public fqt a(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fqa $$8 = new fqa($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
