public class bvh {
   public static final bvh a = new bvh(0.75F, 0.5F, 0.25F);
   public static final bvh b = new bvh(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bvh(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bvh.a a(float $$0) {
      if ($$0 < this.e) {
         return bvh.a.d;
      } else if ($$0 < this.d) {
         return bvh.a.c;
      } else {
         return $$0 < this.c ? bvh.a.b : bvh.a.a;
      }
   }

   public bvh.a a(cxp $$0) {
      return !$$0.m() ? bvh.a.a : this.a($$0.o(), $$0.p());
   }

   public bvh.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
