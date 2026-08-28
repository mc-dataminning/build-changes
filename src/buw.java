public class buw {
   public static final buw a = new buw(0.75F, 0.5F, 0.25F);
   public static final buw b = new buw(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private buw(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public buw.a a(float $$0) {
      if ($$0 < this.e) {
         return buw.a.d;
      } else if ($$0 < this.d) {
         return buw.a.c;
      } else {
         return $$0 < this.c ? buw.a.b : buw.a.a;
      }
   }

   public buw.a a(cxh $$0) {
      return !$$0.m() ? buw.a.a : this.a($$0.o(), $$0.p());
   }

   public buw.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
