import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dqk extends dnc {
   public static final MapCodec<dqk> a = b(dqk::new);
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   private static final fgk f = dnc.b(16.0, 0.0, 1.5);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   public dqk(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return f;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.G_()));
   }

   private static int a(azx $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return !this.a($$0, $$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((djx)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$3.an().equals(bxc.Y)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(djb $$0, iv $$1) {
      exo $$2 = $$0.b_($$1);
      exo $$3 = $$0.b_($$1.d());
      return $$2.a() == exp.c && $$3.a() == exp.a;
   }

   private void a(ars $$0, iv $$1, azx $$2) {
      this.a((djx)$$0, $$1);
      $$0.a(null, $$1, awp.km, awq.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(djx $$0, iv $$1) {
      $$0.b($$1, false);
   }

   private void b(ars $$0, iv $$1, azx $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         clm $$5 = bxc.bv.a($$0, bxb.e);
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

   private double b(azx $$0) {
      double $$1 = 0.2F;
      return azo.a($$0.j(), 0.2F, 0.7999999970197678);
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
