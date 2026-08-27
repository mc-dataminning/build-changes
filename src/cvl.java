import com.google.common.annotations.VisibleForTesting;

public class cvl extends csl {
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   protected static final ehw a = csl.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int f = 3600;
   private static int g = 12000;

   public cvl(dey.d $$0) {
      super($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.y_()));
   }

   private static int a(aru $$0) {
      return $$0.b(f, g);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return !this.a($$0, $$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cpl)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if ($$3.ag().equals(bim.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cor $$0, gu $$1) {
      eac $$2 = $$0.b_($$1);
      eac $$3 = $$0.b_($$1.c());
      return $$2.a() == ead.c && $$3.a() == ead.a;
   }

   private void a(akk $$0, gu $$1, aru $$2) {
      this.a((cpl)$$0, $$1);
      $$0.a(null, $$1, aow.iB, aox.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cpl $$0, gu $$1) {
      $$0.b($$1, false);
   }

   private void b(akk $$0, gu $$1, aru $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bwb $$5 = bim.aW.a((cpl)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fF();
            $$0.b($$5);
         }
      }
   }

   private double b(aru $$0) {
      double $$1 = (double)(bwb.c / 2.0F);
      return arp.a($$0.j(), $$1, 1.0 - $$1);
   }

   @VisibleForTesting
   public static void a(int $$0, int $$1) {
      f = $$0;
      g = $$1;
   }

   @VisibleForTesting
   public static void a() {
      f = 3600;
      g = 12000;
   }
}
