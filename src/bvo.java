public class bvo {
   public static final bvo a = new bvo(0.75F, 0.5F, 0.25F);
   public static final bvo b = new bvo(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bvo(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bvo.a a(float $$0) {
      if ($$0 < this.e) {
         return bvo.a.d;
      } else if ($$0 < this.d) {
         return bvo.a.c;
      } else {
         return $$0 < this.c ? bvo.a.b : bvo.a.a;
      }
   }

   public bvo.a a(cxy $$0) {
      return !$$0.m() ? bvo.a.a : this.a($$0.o(), $$0.p());
   }

   public bvo.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
