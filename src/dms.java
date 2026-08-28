import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dms extends djn {
   public static final MapCodec<dms> a = b(dms::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final fbv b = djn.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.H_()));
   }

   private static int a(azh $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return !this.a($$0, $$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dgj)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$3.aq().equals(but.X)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dfo $$0, ji $$1) {
      eta $$2 = $$0.b_($$1);
      eta $$3 = $$0.b_($$1.d());
      return $$2.a() == etb.c && $$3.a() == etb.a;
   }

   private void a(ard $$0, ji $$1, azh $$2) {
      this.a((dgj)$$0, $$1);
      $$0.a(null, $$1, awa.ki, awb.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dgj $$0, ji $$1) {
      $$0.b($$1, false);
   }

   private void b(ard $$0, ji $$1, azh $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         ciw $$5 = but.bt.a($$0, bus.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fY();
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
