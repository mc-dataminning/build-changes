public class bss {
   public static final bss a = new bss(0.75F, 0.5F, 0.25F);
   public static final bss b = new bss(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bss(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bss.a a(float $$0) {
      if ($$0 < this.e) {
         return bss.a.d;
      } else if ($$0 < this.d) {
         return bss.a.c;
      } else {
         return $$0 < this.c ? bss.a.b : bss.a.a;
      }
   }

   public bss.a a(cup $$0) {
      return !$$0.l() ? bss.a.a : this.a($$0.n(), $$0.o());
   }

   public bss.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
