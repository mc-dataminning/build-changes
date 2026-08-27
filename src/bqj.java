public class bqj {
   public static final bqj a = new bqj(0.75F, 0.5F, 0.25F);
   public static final bqj b = new bqj(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bqj(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bqj.a a(float $$0) {
      if ($$0 < this.e) {
         return bqj.a.d;
      } else if ($$0 < this.d) {
         return bqj.a.c;
      } else {
         return $$0 < this.c ? bqj.a.b : bqj.a.a;
      }
   }

   public bqj.a a(csd $$0) {
      return !$$0.k() ? bqj.a.a : this.a($$0.m(), $$0.n());
   }

   public bqj.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
