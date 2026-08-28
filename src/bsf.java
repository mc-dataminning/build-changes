public class bsf {
   public static final bsf a = new bsf(0.75F, 0.5F, 0.25F);
   public static final bsf b = new bsf(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bsf(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bsf.a a(float $$0) {
      if ($$0 < this.e) {
         return bsf.a.d;
      } else if ($$0 < this.d) {
         return bsf.a.c;
      } else {
         return $$0 < this.c ? bsf.a.b : bsf.a.a;
      }
   }

   public bsf.a a(cud $$0) {
      return !$$0.l() ? bsf.a.a : this.a($$0.n(), $$0.o());
   }

   public bsf.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
