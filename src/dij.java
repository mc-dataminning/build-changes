import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dij extends dff {
   public static final MapCodec<dij> a = b(dij::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ews b = dff.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(aym $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return !this.a($$0, $$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dcd)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if ($$3.ak().equals(bsj.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dbj $$0, ja $$1) {
      eob $$2 = $$0.b_($$1);
      eob $$3 = $$0.b_($$1.c());
      return $$2.a() == eoc.c && $$3.a() == eoc.a;
   }

   private void a(aqk $$0, ja $$1, aym $$2) {
      this.a((dcd)$$0, $$1);
      $$0.a(null, $$1, avf.jI, avg.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dcd $$0, ja $$1) {
      $$0.b($$1, false);
   }

   private void b(aqk $$0, ja $$1, aym $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgl $$5 = bsj.ba.a((dcd)$$0);
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

   private double b(aym $$0) {
      double $$1 = (double)(cgl.c / 2.0F);
      return aye.a($$0.j(), $$1, 1.0 - $$1);
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
