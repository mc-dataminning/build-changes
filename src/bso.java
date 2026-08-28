public class bso {
   public static final bso a = new bso(0.75F, 0.5F, 0.25F);
   public static final bso b = new bso(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bso(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bso.a a(float $$0) {
      if ($$0 < this.e) {
         return bso.a.d;
      } else if ($$0 < this.d) {
         return bso.a.c;
      } else {
         return $$0 < this.c ? bso.a.b : bso.a.a;
      }
   }

   public bso.a a(cuo $$0) {
      return !$$0.l() ? bso.a.a : this.a($$0.n(), $$0.o());
   }

   public bso.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
