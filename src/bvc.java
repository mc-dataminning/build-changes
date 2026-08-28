public class bvc {
   public static final bvc a = new bvc(0.75F, 0.5F, 0.25F);
   public static final bvc b = new bvc(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bvc(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bvc.a a(float $$0) {
      if ($$0 < this.e) {
         return bvc.a.d;
      } else if ($$0 < this.d) {
         return bvc.a.c;
      } else {
         return $$0 < this.c ? bvc.a.b : bvc.a.a;
      }
   }

   public bvc.a a(cxk $$0) {
      return !$$0.m() ? bvc.a.a : this.a($$0.o(), $$0.p());
   }

   public bvc.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
