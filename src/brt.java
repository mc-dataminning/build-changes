public class brt {
   public static final brt a = new brt(0.75F, 0.5F, 0.25F);
   public static final brt b = new brt(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private brt(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public brt.a a(float $$0) {
      if ($$0 < this.e) {
         return brt.a.d;
      } else if ($$0 < this.d) {
         return brt.a.c;
      } else {
         return $$0 < this.c ? brt.a.b : brt.a.a;
      }
   }

   public brt.a a(cuh $$0) {
      return !$$0.k() ? brt.a.a : this.a($$0.m(), $$0.n());
   }

   public brt.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
