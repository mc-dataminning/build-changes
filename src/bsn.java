public class bsn {
   public static final bsn a = new bsn(0.75F, 0.5F, 0.25F);
   public static final bsn b = new bsn(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bsn(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bsn.a a(float $$0) {
      if ($$0 < this.e) {
         return bsn.a.d;
      } else if ($$0 < this.d) {
         return bsn.a.c;
      } else {
         return $$0 < this.c ? bsn.a.b : bsn.a.a;
      }
   }

   public bsn.a a(cuk $$0) {
      return !$$0.l() ? bsn.a.a : this.a($$0.n(), $$0.o());
   }

   public bsn.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
