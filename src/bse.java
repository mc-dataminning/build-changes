public class bse {
   public static final bse a = new bse(0.75F, 0.5F, 0.25F);
   public static final bse b = new bse(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bse(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bse.a a(float $$0) {
      if ($$0 < this.e) {
         return bse.a.d;
      } else if ($$0 < this.d) {
         return bse.a.c;
      } else {
         return $$0 < this.c ? bse.a.b : bse.a.a;
      }
   }

   public bse.a a(cuc $$0) {
      return !$$0.l() ? bse.a.a : this.a($$0.n(), $$0.o());
   }

   public bse.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
