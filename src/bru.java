public class bru {
   public static final bru a = new bru(0.75F, 0.5F, 0.25F);
   public static final bru b = new bru(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bru(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bru.a a(float $$0) {
      if ($$0 < this.e) {
         return bru.a.d;
      } else if ($$0 < this.d) {
         return bru.a.c;
      } else {
         return $$0 < this.c ? bru.a.b : bru.a.a;
      }
   }

   public bru.a a(ctq $$0) {
      return !$$0.l() ? bru.a.a : this.a($$0.n(), $$0.o());
   }

   public bru.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
