public class brf {
   public static final brf a = new brf(0.75F, 0.5F, 0.25F);
   public static final brf b = new brf(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private brf(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public brf.a a(float $$0) {
      if ($$0 < this.e) {
         return brf.a.d;
      } else if ($$0 < this.d) {
         return brf.a.c;
      } else {
         return $$0 < this.c ? brf.a.b : brf.a.a;
      }
   }

   public brf.a a(csz $$0) {
      return !$$0.k() ? brf.a.a : this.a($$0.m(), $$0.n());
   }

   public brf.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
