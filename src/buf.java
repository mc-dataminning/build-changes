public class buf {
   public static final buf a = new buf(0.75F, 0.5F, 0.25F);
   public static final buf b = new buf(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private buf(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public buf.a a(float $$0) {
      if ($$0 < this.e) {
         return buf.a.d;
      } else if ($$0 < this.d) {
         return buf.a.c;
      } else {
         return $$0 < this.c ? buf.a.b : buf.a.a;
      }
   }

   public buf.a a(cwf $$0) {
      return !$$0.m() ? buf.a.a : this.a($$0.o(), $$0.p());
   }

   public buf.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
