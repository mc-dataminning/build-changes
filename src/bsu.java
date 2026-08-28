public class bsu {
   public static final bsu a = new bsu(0.75F, 0.5F, 0.25F);
   public static final bsu b = new bsu(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bsu(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bsu.a a(float $$0) {
      if ($$0 < this.e) {
         return bsu.a.d;
      } else if ($$0 < this.d) {
         return bsu.a.c;
      } else {
         return $$0 < this.c ? bsu.a.b : bsu.a.a;
      }
   }

   public bsu.a a(cur $$0) {
      return !$$0.l() ? bsu.a.a : this.a($$0.n(), $$0.o());
   }

   public bsu.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
