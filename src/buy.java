public class buy {
   public static final buy a = new buy(0.75F, 0.5F, 0.25F);
   public static final buy b = new buy(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private buy(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public buy.a a(float $$0) {
      if ($$0 < this.e) {
         return buy.a.d;
      } else if ($$0 < this.d) {
         return buy.a.c;
      } else {
         return $$0 < this.c ? buy.a.b : buy.a.a;
      }
   }

   public buy.a a(cxg $$0) {
      return !$$0.m() ? buy.a.a : this.a($$0.o(), $$0.p());
   }

   public buy.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
