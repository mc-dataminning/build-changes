public class bvg {
   public static final bvg a = new bvg(0.75F, 0.5F, 0.25F);
   public static final bvg b = new bvg(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bvg(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bvg.a a(float $$0) {
      if ($$0 < this.e) {
         return bvg.a.d;
      } else if ($$0 < this.d) {
         return bvg.a.c;
      } else {
         return $$0 < this.c ? bvg.a.b : bvg.a.a;
      }
   }

   public bvg.a a(cxo $$0) {
      return !$$0.m() ? bvg.a.a : this.a($$0.o(), $$0.p());
   }

   public bvg.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
