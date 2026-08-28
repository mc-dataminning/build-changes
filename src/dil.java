import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dil extends dfh {
   public static final MapCodec<dil> a = b(dil::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ewy b = dfh.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ayo $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return !this.a($$0, $$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dcf)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if ($$3.al().equals(bsm.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dbl $$0, ja $$1) {
      eoh $$2 = $$0.b_($$1);
      eoh $$3 = $$0.b_($$1.c());
      return $$2.a() == eoi.c && $$3.a() == eoi.a;
   }

   private void a(aqm $$0, ja $$1, ayo $$2) {
      this.a((dcf)$$0, $$1);
      $$0.a(null, $$1, avh.jI, avi.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dcf $$0, ja $$1) {
      $$0.b($$1, false);
   }

   private void b(aqm $$0, ja $$1, ayo $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgo $$5 = bsm.ba.a((dcf)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fR();
            $$0.b($$5);
         }
      }
   }

   private double b(ayo $$0) {
      double $$1 = 0.2F;
      return ayg.a($$0.j(), 0.2F, 0.7999999970197678);
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
