import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dic extends dey {
   public static final MapCodec<dic> a = b(dic::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ewj b = dey.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public dic(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(azg $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return !this.a($$0, $$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dbx)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if ($$3.ak().equals(bsz.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dbd $$0, iz $$1) {
      enu $$2 = $$0.b_($$1);
      enu $$3 = $$0.b_($$1.c());
      return $$2.a() == env.c && $$3.a() == env.a;
   }

   private void a(are $$0, iz $$1, azg $$2) {
      this.a((dbx)$$0, $$1);
      $$0.a(null, $$1, avz.jI, awa.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dbx $$0, iz $$1) {
      $$0.b($$1, false);
   }

   private void b(are $$0, iz $$1, azg $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         chb $$5 = bsz.ba.a((dbx)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fU();
            $$0.b($$5);
         }
      }
   }

   private double b(azg $$0) {
      double $$1 = (double)(chb.c / 2.0F);
      return ayy.a($$0.j(), $$1, 1.0 - $$1);
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
