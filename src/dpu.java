import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dpu extends dmm {
   public static final MapCodec<dpu> a = b(dpu::new);
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   private static final ffr f = dmm.b(16.0, 0.0, 1.5);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return f;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.C_()));
   }

   private static int a(azv $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return !this.a($$0, $$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((djh)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3.an().equals(bwr.X)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(din $$0, iv $$1) {
      ewv $$2 = $$0.b_($$1);
      ewv $$3 = $$0.b_($$1.d());
      return $$2.a() == eww.c && $$3.a() == eww.a;
   }

   private void a(arq $$0, iv $$1, azv $$2) {
      this.a((djh)$$0, $$1);
      $$0.a(null, $$1, awn.km, awo.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(djh $$0, iv $$1) {
      $$0.b($$1, false);
   }

   private void b(arq $$0, iv $$1, azv $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cle $$5 = bwr.bu.a($$0, bwq.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.gb();
            $$0.b($$5);
         }
      }
   }

   private double b(azv $$0) {
      double $$1 = 0.2F;
      return azm.a($$0.j(), 0.2F, 0.7999999970197678);
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
