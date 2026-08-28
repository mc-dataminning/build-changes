import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dim extends dfi {
   public static final MapCodec<dim> a = b(dim::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final exa b = dfi.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ayo $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return !this.a($$0, $$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dcg)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if ($$3.am().equals(bsn.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dbm $$0, ja $$1) {
      eoj $$2 = $$0.b_($$1);
      eoj $$3 = $$0.b_($$1.c());
      return $$2.a() == eok.c && $$3.a() == eok.a;
   }

   private void a(aqm $$0, ja $$1, ayo $$2) {
      this.a((dcg)$$0, $$1);
      $$0.a(null, $$1, avh.jI, avi.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dcg $$0, ja $$1) {
      $$0.b($$1, false);
   }

   private void b(aqm $$0, ja $$1, ayo $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgp $$5 = bsn.ba.a((dcg)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fQ();
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
