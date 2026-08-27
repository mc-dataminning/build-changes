public class fqz extends frt {
   private final double a;
   private final double b;
   private final double F;

   protected fqz(fnq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.a = this.g;
      this.b = this.h;
      this.F = this.i;
      this.D = 0.1F * (this.r.i() * 0.2F + 0.5F);
      float $$7 = this.r.i() * 0.6F + 0.4F;
      this.v = $$7 * 0.9F;
      this.w = $$7 * 0.3F;
      this.x = $$7;
      this.t = (int)(Math.random() * 10.0) + 40;
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
   public float b(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      $$1 = 1.0F - $$1;
      $$1 *= $$1;
      $$1 = 1.0F - $$1;
      return this.D * $$1;
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
         float var3 = -$$0 + $$0 * $$0 * 2.0F;
         float var4 = 1.0F - var3;
         this.g = this.a + this.j * (double)var4;
         this.h = this.b + this.k * (double)var4 + (double)(1.0F - $$0);
         this.i = this.F + this.l * (double)var4;
      }
   }

   public static class a implements fqw<ka> {
      private final fro a;

      public a(fro $$0) {
         this.a = $$0;
      }

      public fqt a(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fqz $$8 = new fqz($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
