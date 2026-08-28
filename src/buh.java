public class buh {
   public static final buh a = new buh(0.75F, 0.5F, 0.25F);
   public static final buh b = new buh(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private buh(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public buh.a a(float $$0) {
      if ($$0 < this.e) {
         return buh.a.d;
      } else if ($$0 < this.d) {
         return buh.a.c;
      } else {
         return $$0 < this.c ? buh.a.b : buh.a.a;
      }
   }

   public buh.a a(cwo $$0) {
      return !$$0.m() ? buh.a.a : this.a($$0.o(), $$0.p());
   }

   public buh.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
