public class bvw {
   public static final bvw a = new bvw(0.75F, 0.5F, 0.25F);
   public static final bvw b = new bvw(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bvw(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bvw.a a(float $$0) {
      if ($$0 < this.e) {
         return bvw.a.d;
      } else if ($$0 < this.d) {
         return bvw.a.c;
      } else {
         return $$0 < this.c ? bvw.a.b : bvw.a.a;
      }
   }

   public bvw.a a(cys $$0) {
      return !$$0.m() ? bvw.a.a : this.a($$0.o(), $$0.p());
   }

   public bvw.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
