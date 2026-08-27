public class bpt {
   public static final bpt a = new bpt(0.75F, 0.5F, 0.25F);
   public static final bpt b = new bpt(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bpt(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bpt.a a(float $$0) {
      if ($$0 < this.e) {
         return bpt.a.d;
      } else if ($$0 < this.d) {
         return bpt.a.c;
      } else {
         return $$0 < this.c ? bpt.a.b : bpt.a.a;
      }
   }

   public bpt.a a(crj $$0) {
      return !$$0.k() ? bpt.a.a : this.a($$0.m(), $$0.n());
   }

   public bpt.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
