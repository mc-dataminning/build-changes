import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dik extends dfc {
   public static final MapCodec<dik> a = b(dik::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final exn b = dfc.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(ayt $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return !this.a($$0, $$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dca)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$3.ak().equals(bsb.Q)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dbg $$0, ir $$1) {
      epe $$2 = $$0.b_($$1);
      epe $$3 = $$0.b_($$1.c());
      return $$2.a() == epf.c && $$3.a() == epf.a;
   }

   private void a(aqt $$0, ir $$1, ayt $$2) {
      this.a((dca)$$0, $$1);
      $$0.a(null, $$1, avo.jV, avq.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dca $$0, ir $$1) {
      $$0.b($$1, false);
   }

   private void b(aqt $$0, ir $$1, ayt $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgb $$5 = bsb.bd.a((dca)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.gc();
            $$0.b($$5);
         }
      }
   }

   private double b(ayt $$0) {
      double $$1 = (double)(cgb.c / 2.0F);
      return aym.a($$0.j(), $$1, 1.0 - $$1);
   }

   @VisibleForTesting
   public static void a(int $$0, int $$1) {
      g = $$0;
      h = $$1;
   }

   @VisibleForTesting
   public static void b() {
      g = 3600;
      h = 12000;
   }
}
