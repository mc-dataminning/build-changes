public class btg {
   public static final btg a = new btg(0.75F, 0.5F, 0.25F);
   public static final btg b = new btg(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private btg(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public btg.a a(float $$0) {
      if ($$0 < this.e) {
         return btg.a.d;
      } else if ($$0 < this.d) {
         return btg.a.c;
      } else {
         return $$0 < this.c ? btg.a.b : btg.a.a;
      }
   }

   public btg.a a(cvl $$0) {
      return !$$0.m() ? btg.a.a : this.a($$0.o(), $$0.p());
   }

   public btg.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
