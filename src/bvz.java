public class bvz {
   public static final bvz a = new bvz(0.75F, 0.5F, 0.25F);
   public static final bvz b = new bvz(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bvz(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bvz.a a(float $$0) {
      if ($$0 < this.e) {
         return bvz.a.d;
      } else if ($$0 < this.d) {
         return bvz.a.c;
      } else {
         return $$0 < this.c ? bvz.a.b : bvz.a.a;
      }
   }

   public bvz.a a(cyy $$0) {
      return !$$0.m() ? bvz.a.a : this.a($$0.o(), $$0.p());
   }

   public bvz.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
