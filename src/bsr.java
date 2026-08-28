public class bsr {
   public static final bsr a = new bsr(0.75F, 0.5F, 0.25F);
   public static final bsr b = new bsr(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bsr(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bsr.a a(float $$0) {
      if ($$0 < this.e) {
         return bsr.a.d;
      } else if ($$0 < this.d) {
         return bsr.a.c;
      } else {
         return $$0 < this.c ? bsr.a.b : bsr.a.a;
      }
   }

   public bsr.a a(cuo $$0) {
      return !$$0.l() ? bsr.a.a : this.a($$0.n(), $$0.o());
   }

   public bsr.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
