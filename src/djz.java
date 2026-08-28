import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class djz extends dgv {
   public static final MapCodec<djz> a = b(djz::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eyx b = dgv.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.C_()));
   }

   private static int a(azk $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return !this.a($$0, $$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dds)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$3.ao().equals(btq.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dcx $$0, je $$1) {
      eqb $$2 = $$0.b_($$1);
      eqb $$3 = $$0.b_($$1.d());
      return $$2.a() == eqc.c && $$3.a() == eqc.a;
   }

   private void a(arg $$0, je $$1, azk $$2) {
      this.a((dds)$$0, $$1);
      $$0.a(null, $$1, awd.jJ, awe.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dds $$0, je $$1) {
      $$0.b($$1, false);
   }

   private void b(arg $$0, je $$1, azk $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         chs $$5 = btq.ba.a($$0, btp.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fV();
            $$0.b($$5);
         }
      }
   }

   private double b(azk $$0) {
      double $$1 = 0.2F;
      return azc.a($$0.j(), 0.2F, 0.7999999970197678);
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
