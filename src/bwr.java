public class bwr {
   public static final bwr a = new bwr(0.75F, 0.5F, 0.25F);
   public static final bwr b = new bwr(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bwr(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bwr.a a(float $$0) {
      if ($$0 < this.e) {
         return bwr.a.d;
      } else if ($$0 < this.d) {
         return bwr.a.c;
      } else {
         return $$0 < this.c ? bwr.a.b : bwr.a.a;
      }
   }

   public bwr.a a(daa $$0) {
      return !$$0.m() ? bwr.a.a : this.a($$0.o(), $$0.p());
   }

   public bwr.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
