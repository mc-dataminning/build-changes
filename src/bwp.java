public class bwp {
   public static final bwp a = new bwp(0.75F, 0.5F, 0.25F);
   public static final bwp b = new bwp(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bwp(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bwp.a a(float $$0) {
      if ($$0 < this.e) {
         return bwp.a.d;
      } else if ($$0 < this.d) {
         return bwp.a.c;
      } else {
         return $$0 < this.c ? bwp.a.b : bwp.a.a;
      }
   }

   public bwp.a a(czy $$0) {
      return !$$0.m() ? bwp.a.a : this.a($$0.o(), $$0.p());
   }

   public bwp.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
