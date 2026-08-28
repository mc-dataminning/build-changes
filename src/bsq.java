public class bsq {
   public static final bsq a = new bsq(0.75F, 0.5F, 0.25F);
   public static final bsq b = new bsq(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bsq(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bsq.a a(float $$0) {
      if ($$0 < this.e) {
         return bsq.a.d;
      } else if ($$0 < this.d) {
         return bsq.a.c;
      } else {
         return $$0 < this.c ? bsq.a.b : bsq.a.a;
      }
   }

   public bsq.a a(cun $$0) {
      return !$$0.l() ? bsq.a.a : this.a($$0.n(), $$0.o());
   }

   public bsq.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
