import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dnq extends dkl {
   public static final MapCodec<dnq> a = b(dnq::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final fcr b = dkl.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.H_()));
   }

   private static int a(bam $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return !this.a($$0, $$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dhh)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$3.aq().equals(bvq.Y)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dgm $$0, jh $$1) {
      etw $$2 = $$0.b_($$1);
      etw $$3 = $$0.b_($$1.d());
      return $$2.a() == etx.c && $$3.a() == etx.a;
   }

   private void a(ash $$0, jh $$1, bam $$2) {
      this.a((dhh)$$0, $$1);
      $$0.a(null, $$1, axf.kc, axg.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dhh $$0, jh $$1) {
      $$0.b($$1, false);
   }

   private void b(ash $$0, jh $$1, bam $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cjt $$5 = bvq.bu.a($$0, bvp.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.ai();
            $$0.b($$5);
         }
      }
   }

   private double b(bam $$0) {
      double $$1 = 0.2F;
      return bae.a($$0.j(), 0.2F, 0.7999999970197678);
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
