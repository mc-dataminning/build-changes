public class bug {
   public static final bug a = new bug(0.75F, 0.5F, 0.25F);
   public static final bug b = new bug(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bug(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bug.a a(float $$0) {
      if ($$0 < this.e) {
         return bug.a.d;
      } else if ($$0 < this.d) {
         return bug.a.c;
      } else {
         return $$0 < this.c ? bug.a.b : bug.a.a;
      }
   }

   public bug.a a(cwn $$0) {
      return !$$0.m() ? bug.a.a : this.a($$0.o(), $$0.p());
   }

   public bug.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
