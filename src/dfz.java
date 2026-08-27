import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dfz extends dcv {
   public static final MapCodec<dfz> a = b(dfz::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ety b = dcv.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfz(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ayd $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return !this.a($$0, $$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((czu)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if ($$3.ai().equals(bqr.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cza $$0, im $$1) {
      elr $$2 = $$0.b_($$1);
      elr $$3 = $$0.b_($$1.c());
      return $$2.a() == els.c && $$3.a() == els.a;
   }

   private void a(aqe $$0, im $$1, ayd $$2) {
      this.a((czu)$$0, $$1);
      $$0.a(null, $$1, auz.jD, ava.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(czu $$0, im $$1) {
      $$0.b($$1, false);
   }

   private void b(aqe $$0, im $$1, ayd $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         ceq $$5 = bqr.aZ.a((czu)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fT();
            $$0.b($$5);
         }
      }
   }

   private double b(ayd $$0) {
      double $$1 = (double)(ceq.c / 2.0F);
      return axw.a($$0.j(), $$1, 1.0 - $$1);
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
