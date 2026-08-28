import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class die extends dfa {
   public static final MapCodec<die> a = b(die::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ewl b = dfa.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(azh $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return !this.a($$0, $$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dbz)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if ($$3.ak().equals(btb.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dbf $$0, iz $$1) {
      enw $$2 = $$0.b_($$1);
      enw $$3 = $$0.b_($$1.c());
      return $$2.a() == enx.c && $$3.a() == enx.a;
   }

   private void a(arf $$0, iz $$1, azh $$2) {
      this.a((dbz)$$0, $$1);
      $$0.a(null, $$1, awa.jI, awb.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dbz $$0, iz $$1) {
      $$0.b($$1, false);
   }

   private void b(arf $$0, iz $$1, azh $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         chd $$5 = btb.ba.a((dbz)$$0);
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

   private double b(azh $$0) {
      double $$1 = (double)(chd.c / 2.0F);
      return ayz.a($$0.j(), $$1, 1.0 - $$1);
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
