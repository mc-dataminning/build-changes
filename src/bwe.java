public class bwe {
   public static final bwe a = new bwe(0.75F, 0.5F, 0.25F);
   public static final bwe b = new bwe(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bwe(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bwe.a a(float $$0) {
      if ($$0 < this.e) {
         return bwe.a.d;
      } else if ($$0 < this.d) {
         return bwe.a.c;
      } else {
         return $$0 < this.c ? bwe.a.b : bwe.a.a;
      }
   }

   public bwe.a a(czn $$0) {
      return !$$0.m() ? bwe.a.a : this.a($$0.o(), $$0.p());
   }

   public bwe.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
