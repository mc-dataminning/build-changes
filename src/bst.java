public class bst {
   public static final bst a = new bst(0.75F, 0.5F, 0.25F);
   public static final bst b = new bst(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bst(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bst.a a(float $$0) {
      if ($$0 < this.e) {
         return bst.a.d;
      } else if ($$0 < this.d) {
         return bst.a.c;
      } else {
         return $$0 < this.c ? bst.a.b : bst.a.a;
      }
   }

   public bst.a a(cuq $$0) {
      return !$$0.l() ? bst.a.a : this.a($$0.n(), $$0.o());
   }

   public bst.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / (float)$$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
