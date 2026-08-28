public class bto {
   public static final bto a = new bto(0.75F, 0.5F, 0.25F);
   public static final bto b = new bto(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bto(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bto.a a(float $$0) {
      if ($$0 < this.e) {
         return bto.a.d;
      } else if ($$0 < this.d) {
         return bto.a.c;
      } else {
         return $$0 < this.c ? bto.a.b : bto.a.a;
      }
   }

   public bto.a a(cvs $$0) {
      return !$$0.m() ? bto.a.a : this.a($$0.o(), $$0.p());
   }

   public bto.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
