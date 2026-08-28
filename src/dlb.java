import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dlb extends dhy {
   public static final MapCodec<dlb> a = b(dlb::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final fab b = dhy.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(azr $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return !this.a($$0, $$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dev)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$3.aq().equals(bug.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dea $$0, jg $$1) {
      ere $$2 = $$0.b_($$1);
      ere $$3 = $$0.b_($$1.d());
      return $$2.a() == erf.c && $$3.a() == erf.a;
   }

   private void a(arm $$0, jg $$1, azr $$2) {
      this.a((dev)$$0, $$1);
      $$0.a(null, $$1, awk.jJ, awl.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dev $$0, jg $$1) {
      $$0.b($$1, false);
   }

   private void b(arm $$0, jg $$1, azr $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cij $$5 = bug.ba.a($$0, buf.e);
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

   private double b(azr $$0) {
      double $$1 = 0.2F;
      return azj.a($$0.j(), 0.2F, 0.7999999970197678);
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
