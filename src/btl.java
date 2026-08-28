public class btl {
   public static final btl a = new btl(0.75F, 0.5F, 0.25F);
   public static final btl b = new btl(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private btl(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public btl.a a(float $$0) {
      if ($$0 < this.e) {
         return btl.a.d;
      } else if ($$0 < this.d) {
         return btl.a.c;
      } else {
         return $$0 < this.c ? btl.a.b : btl.a.a;
      }
   }

   public btl.a a(cvp $$0) {
      return !$$0.m() ? btl.a.a : this.a($$0.o(), $$0.p());
   }

   public btl.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
