public class bub {
   public static final bub a = new bub(0.75F, 0.5F, 0.25F);
   public static final bub b = new bub(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bub(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bub.a a(float $$0) {
      if ($$0 < this.e) {
         return bub.a.d;
      } else if ($$0 < this.d) {
         return bub.a.c;
      } else {
         return $$0 < this.c ? bub.a.b : bub.a.a;
      }
   }

   public bub.a a(cwb $$0) {
      return !$$0.m() ? bub.a.a : this.a($$0.o(), $$0.p());
   }

   public bub.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
