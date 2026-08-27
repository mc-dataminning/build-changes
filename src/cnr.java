public class cnr extends cne {
   public final cnr.a a;

   public cnr(cne.a $$0, cnr.a $$1, bin... $$2) {
      super($$0, $$1 == cnr.a.c ? cnf.b : cnf.a, $$2);
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
   public int a(int $$0, bhg $$1) {
      if ($$1.a(apn.d)) {
         return 0;
      } else if (this.a == cnr.a.a) {
         return $$0;
      } else if (this.a == cnr.a.b && $$1.a(apn.i)) {
         return $$0 * 2;
      } else if (this.a == cnr.a.c && $$1.a(apn.m)) {
         return $$0 * 3;
      } else if (this.a == cnr.a.d && $$1.a(apn.l)) {
         return $$0 * 2;
      } else {
         return this.a == cnr.a.e && $$1.a(apn.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cne $$0) {
      if ($$0 instanceof cnr $$1) {
         return this.a == $$1.a ? false : this.a == cnr.a.c || $$1.a == cnr.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(biy $$0, int $$1) {
      int $$2 = cng.a(cni.b, $$0);
      if ($$2 > 0) {
         $$1 -= arp.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(biy $$0, double $$1) {
      int $$2 = cng.a(cni.d, $$0);
      if ($$2 > 0) {
         $$1 *= arp.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
