import com.google.common.annotations.VisibleForTesting;

public class csn extends cpn {
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   protected static final efb a = cpn.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int f = 3600;
   private static int g = 12000;

   public csn(dca.d $$0) {
      super($$0);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.y_()));
   }

   private static int a(apf $$0) {
      return $$0.b(f, g);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return !this.a($$0, $$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cmm)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if ($$3.ae().equals(bfn.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cls $$0, gu $$1) {
      dxe $$2 = $$0.b_($$1);
      dxe $$3 = $$0.b_($$1.c());
      return $$2.a() == dxf.c && $$3.a() == dxf.a;
   }

   private void a(aif $$0, gu $$1, apf $$2) {
      this.a((cmm)$$0, $$1);
      $$0.a(null, $$1, amh.iB, ami.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cmm $$0, gu $$1) {
      $$0.b($$1, false);
   }

   private void b(aif $$0, gu $$1, apf $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         btd $$5 = bfn.aW.a((cmm)$$0);
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

   private double b(apf $$0) {
      double $$1 = (double)(btd.c / 2.0F);
      return apa.a($$0.j(), $$1, 1.0 - $$1);
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
