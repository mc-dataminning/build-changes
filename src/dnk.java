import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dnk extends dke {
   public static final MapCodec<dnk> a = b(dnk::new);
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   private static final fcr f = dke.b(16.0, 0.0, 1.5);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return f;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.C_()));
   }

   private static int a(azh $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dgz)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$3.aq().equals(bvi.X)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dgf $$0, ji $$1) {
      etw $$2 = $$0.b_($$1);
      etw $$3 = $$0.b_($$1.d());
      return $$2.a() == etx.c && $$3.a() == etx.a;
   }

   private void a(ard $$0, ji $$1, azh $$2) {
      this.a((dgz)$$0, $$1);
      $$0.a(null, $$1, awa.ki, awb.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dgz $$0, ji $$1) {
      $$0.b($$1, false);
   }

   private void b(ard $$0, ji $$1, azh $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cjp $$5 = bvi.bt.a($$0, bvh.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.ga();
            $$0.b($$5);
         }
      }
   }

   private double b(azh $$0) {
      double $$1 = 0.2F;
      return ayz.a($$0.j(), 0.2F, 0.7999999970197678);
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
