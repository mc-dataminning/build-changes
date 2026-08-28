public class buj {
   public static final buj a = new buj(0.75F, 0.5F, 0.25F);
   public static final buj b = new buj(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private buj(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public buj.a a(float $$0) {
      if ($$0 < this.e) {
         return buj.a.d;
      } else if ($$0 < this.d) {
         return buj.a.c;
      } else {
         return $$0 < this.c ? buj.a.b : buj.a.a;
      }
   }

   public buj.a a(cwq $$0) {
      return !$$0.m() ? buj.a.a : this.a($$0.o(), $$0.p());
   }

   public buj.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
