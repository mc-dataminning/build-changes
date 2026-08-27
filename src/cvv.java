import com.google.common.annotations.VisibleForTesting;

public class cvv extends csv {
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   protected static final eig a = csv.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int f = 3600;
   private static int g = 12000;

   public cvv(dfi.d $$0) {
      super($$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.D_()));
   }

   private static int a(asc $$0) {
      return $$0.b(f, g);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return !this.a($$0, $$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cpv)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if ($$3.ag().equals(biu.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cpb $$0, gw $$1) {
      eam $$2 = $$0.b_($$1);
      eam $$3 = $$0.b_($$1.c());
      return $$2.a() == ean.c && $$3.a() == ean.a;
   }

   private void a(akr $$0, gw $$1, asc $$2) {
      this.a((cpv)$$0, $$1);
      $$0.a(null, $$1, ape.iB, apf.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cpv $$0, gw $$1) {
      $$0.b($$1, false);
   }

   private void b(akr $$0, gw $$1, asc $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bwj $$5 = biu.aW.a((cpv)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fI();
            $$0.b($$5);
         }
      }
   }

   private double b(asc $$0) {
      double $$1 = (double)(bwj.c / 2.0F);
      return arx.a($$0.j(), $$1, 1.0 - $$1);
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
