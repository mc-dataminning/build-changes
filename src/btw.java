public class btw {
   public static final btw a = new btw(0.75F, 0.5F, 0.25F);
   public static final btw b = new btw(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private btw(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public btw.a a(float $$0) {
      if ($$0 < this.e) {
         return btw.a.d;
      } else if ($$0 < this.d) {
         return btw.a.c;
      } else {
         return $$0 < this.c ? btw.a.b : btw.a.a;
      }
   }

   public btw.a a(cvx $$0) {
      return !$$0.m() ? btw.a.a : this.a($$0.o(), $$0.p());
   }

   public btw.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
