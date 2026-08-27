public class cnw extends cnj {
   public final cnw.a a;

   public cnw(cnj.a $$0, cnw.a $$1, biq... $$2) {
      super($$0, $$1 == cnw.a.c ? cnk.b : cnk.a, $$2);
      this.a = $$1;
   }

   @Override
   public int a(int $$0) {
      return this.a.a() + ($$0 - 1) * this.a.b();
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + this.a.b();
   }

   @Override
   public int a() {
      return 4;
   }

   @Override
   public int a(int $$0, bhj $$1) {
      if ($$1.a(apq.d)) {
         return 0;
      } else if (this.a == cnw.a.a) {
         return $$0;
      } else if (this.a == cnw.a.b && $$1.a(apq.i)) {
         return $$0 * 2;
      } else if (this.a == cnw.a.c && $$1.a(apq.m)) {
         return $$0 * 3;
      } else if (this.a == cnw.a.d && $$1.a(apq.l)) {
         return $$0 * 2;
      } else {
         return this.a == cnw.a.e && $$1.a(apq.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cnj $$0) {
      if ($$0 instanceof cnw $$1) {
         return this.a == $$1.a ? false : this.a == cnw.a.c || $$1.a == cnw.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bjb $$0, int $$1) {
      int $$2 = cnl.a(cnn.b, $$0);
      if ($$2 > 0) {
         $$1 -= ars.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bjb $$0, double $$1) {
      int $$2 = cnl.a(cnn.d, $$0);
      if ($$2 > 0) {
         $$1 *= ars.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
