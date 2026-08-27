public class cty extends ctm {
   public final cty.a b;

   public cty(ctm.a $$0, cty.a $$1, bnx... $$2) {
      super($$0, $$1 == cty.a.c ? aui.ba : aui.be, $$2);
      this.b = $$1;
   }

   @Override
   public int a(int $$0) {
      return this.b.a() + ($$0 - 1) * this.b.b();
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + this.b.b();
   }

   @Override
   public int a() {
      return 4;
   }

   @Override
   public int a(int $$0, bmp $$1) {
      if ($$1.a(auc.e)) {
         return 0;
      } else if (this.b == cty.a.a) {
         return $$0;
      } else if (this.b == cty.a.b && $$1.a(auc.j)) {
         return $$0 * 2;
      } else if (this.b == cty.a.c && $$1.a(auc.n)) {
         return $$0 * 3;
      } else if (this.b == cty.a.d && $$1.a(auc.m)) {
         return $$0 * 2;
      } else {
         return this.b == cty.a.e && $$1.a(auc.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(ctm $$0) {
      if ($$0 instanceof cty $$1) {
         return this.b == $$1.b ? false : this.b == cty.a.c || $$1.b == cty.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(boi $$0, int $$1) {
      int $$2 = ctn.a(ctp.b, $$0);
      if ($$2 > 0) {
         $$1 -= awi.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(boi $$0, double $$1) {
      int $$2 = ctn.a(ctp.d, $$0);
      if ($$2 > 0) {
         $$1 *= awi.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
      }

      return $$1;
   }

   public static enum a {
      a(1, 11),
      b(10, 8),
      c(5, 6),
      d(5, 8),
      e(3, 6);

      private final int f;
      private final int g;

      private a(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public int a() {
         return this.f;
      }

      public int b() {
         return this.g;
      }
   }
}
