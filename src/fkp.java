public class fkp extends fmu {
   private final fmp a;

   fkp(fix $$0, double $$1, double $$2, double $$3, double $$4, fmp $$5) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a = $$5;
      this.t = 4;
      float $$6 = this.r.i() * 0.6F + 0.4F;
      this.v = $$6;
      this.w = $$6;
      this.x = $$6;
      this.D = 1.0F - (float)$$4 * 0.5F;
      this.b($$5);
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.a);
      }
   }

   @Override
   public fly b() {
      return fly.d;
   }

   public static class a implements flx<ja> {
      private final fmp a;

      public a(fmp $$0) {
         this.a = $$0;
      }

      public flu a(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fkp($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
