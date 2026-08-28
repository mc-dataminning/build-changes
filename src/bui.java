public class bui {
   public static final bui a = new bui(0.75F, 0.5F, 0.25F);
   public static final bui b = new bui(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bui(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bui.a a(float $$0) {
      if ($$0 < this.e) {
         return bui.a.d;
      } else if ($$0 < this.d) {
         return bui.a.c;
      } else {
         return $$0 < this.c ? bui.a.b : bui.a.a;
      }
   }

   public bui.a a(cwm $$0) {
      return !$$0.m() ? bui.a.a : this.a($$0.o(), $$0.p());
   }

   public bui.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
