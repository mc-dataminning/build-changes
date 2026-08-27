import com.google.common.annotations.VisibleForTesting;

public class cvx extends csx {
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   protected static final eii a = csx.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int f = 3600;
   private static int g = 12000;

   public cvx(dfk.d $$0) {
      super($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.D_()));
   }

   private static int a(ase $$0) {
      return $$0.b(f, g);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return !this.a($$0, $$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cpx)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if ($$3.ag().equals(biw.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cpd $$0, gw $$1) {
      eao $$2 = $$0.b_($$1);
      eao $$3 = $$0.b_($$1.c());
      return $$2.a() == eap.c && $$3.a() == eap.a;
   }

   private void a(aks $$0, gw $$1, ase $$2) {
      this.a((cpx)$$0, $$1);
      $$0.a(null, $$1, apf.iB, apg.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cpx $$0, gw $$1) {
      $$0.b($$1, false);
   }

   private void b(aks $$0, gw $$1, ase $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bwl $$5 = biw.aW.a((cpx)$$0);
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

   private double b(ase $$0) {
      double $$1 = (double)(bwl.c / 2.0F);
      return ary.a($$0.j(), $$1, 1.0 - $$1);
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
