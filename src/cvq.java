import com.google.common.annotations.VisibleForTesting;

public class cvq extends csq {
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   protected static final eib a = csq.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int f = 3600;
   private static int g = 12000;

   public cvq(dfd.d $$0) {
      super($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.y_()));
   }

   private static int a(arx $$0) {
      return $$0.b(f, g);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return !this.a($$0, $$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cpq)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if ($$3.ag().equals(bip.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cow $$0, gw $$1) {
      eah $$2 = $$0.b_($$1);
      eah $$3 = $$0.b_($$1.c());
      return $$2.a() == eai.c && $$3.a() == eai.a;
   }

   private void a(akn $$0, gw $$1, arx $$2) {
      this.a((cpq)$$0, $$1);
      $$0.a(null, $$1, aoz.iB, apa.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cpq $$0, gw $$1) {
      $$0.b($$1, false);
   }

   private void b(akn $$0, gw $$1, arx $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bwe $$5 = bip.aW.a((cpq)$$0);
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

   private double b(arx $$0) {
      double $$1 = (double)(bwe.c / 2.0F);
      return ars.a($$0.j(), $$1, 1.0 - $$1);
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
