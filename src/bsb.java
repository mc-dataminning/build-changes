public class bsb {
   public static final bsb a = new bsb(0.75F, 0.5F, 0.25F);
   public static final bsb b = new bsb(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bsb(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bsb.a a(float $$0) {
      if ($$0 < this.e) {
         return bsb.a.d;
      } else if ($$0 < this.d) {
         return bsb.a.c;
      } else {
         return $$0 < this.c ? bsb.a.b : bsb.a.a;
      }
   }

   public bsb.a a(cua $$0) {
      return !$$0.l() ? bsb.a.a : this.a($$0.n(), $$0.o());
   }

   public bsb.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
