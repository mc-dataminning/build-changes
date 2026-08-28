public class bsp {
   public static final bsp a = new bsp(0.75F, 0.5F, 0.25F);
   public static final bsp b = new bsp(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bsp(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bsp.a a(float $$0) {
      if ($$0 < this.e) {
         return bsp.a.d;
      } else if ($$0 < this.d) {
         return bsp.a.c;
      } else {
         return $$0 < this.c ? bsp.a.b : bsp.a.a;
      }
   }

   public bsp.a a(cuq $$0) {
      return !$$0.l() ? bsp.a.a : this.a($$0.n(), $$0.o());
   }

   public bsp.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
