public class bxa {
   public static final bxa a = new bxa(0.75F, 0.5F, 0.25F);
   public static final bxa b = new bxa(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bxa(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bxa.a a(float $$0) {
      if ($$0 < this.e) {
         return bxa.a.d;
      } else if ($$0 < this.d) {
         return bxa.a.c;
      } else {
         return $$0 < this.c ? bxa.a.b : bxa.a.a;
      }
   }

   public bxa.a a(dak $$0) {
      return !$$0.m() ? bxa.a.a : this.a($$0.o(), $$0.p());
   }

   public bxa.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
