import com.google.common.annotations.VisibleForTesting;

public class cvk extends csk {
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   protected static final ehy a = csk.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int f = 3600;
   private static int g = 12000;

   public cvk(dex.d $$0) {
      super($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.y_()));
   }

   private static int a(art $$0) {
      return $$0.b(f, g);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return !this.a($$0, $$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cpk)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if ($$3.ag().equals(bik.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(coq $$0, gv $$1) {
      eab $$2 = $$0.b_($$1);
      eab $$3 = $$0.b_($$1.c());
      return $$2.a() == eac.c && $$3.a() == eac.a;
   }

   private void a(aki $$0, gv $$1, art $$2) {
      this.a((cpk)$$0, $$1);
      $$0.a(null, $$1, aou.iB, aov.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cpk $$0, gv $$1) {
      $$0.b($$1, false);
   }

   private void b(aki $$0, gv $$1, art $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bwa $$5 = bik.aW.a((cpk)$$0);
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

   private double b(art $$0) {
      double $$1 = (double)(bwa.c / 2.0F);
      return aro.a($$0.j(), $$1, 1.0 - $$1);
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
