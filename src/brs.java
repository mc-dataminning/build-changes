public class brs {
   public static final brs a = new brs(0.75F, 0.5F, 0.25F);
   public static final brs b = new brs(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private brs(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public brs.a a(float $$0) {
      if ($$0 < this.e) {
         return brs.a.d;
      } else if ($$0 < this.d) {
         return brs.a.c;
      } else {
         return $$0 < this.c ? brs.a.b : brs.a.a;
      }
   }

   public brs.a a(cto $$0) {
      return !$$0.l() ? brs.a.a : this.a($$0.n(), $$0.o());
   }

   public brs.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
