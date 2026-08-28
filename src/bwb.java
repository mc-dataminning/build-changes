public class bwb {
   public static final bwb a = new bwb(0.75F, 0.5F, 0.25F);
   public static final bwb b = new bwb(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bwb(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bwb.a a(float $$0) {
      if ($$0 < this.e) {
         return bwb.a.d;
      } else if ($$0 < this.d) {
         return bwb.a.c;
      } else {
         return $$0 < this.c ? bwb.a.b : bwb.a.a;
      }
   }

   public bwb.a a(czd $$0) {
      return !$$0.m() ? bwb.a.a : this.a($$0.o(), $$0.p());
   }

   public bwb.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
