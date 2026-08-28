import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dlh extends die {
   public static final MapCodec<dlh> a = b(dlh::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final fah b = die.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(azs $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return !this.a($$0, $$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dfb)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$3.ar().equals(bul.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(deg $$0, jh $$1) {
      erk $$2 = $$0.b_($$1);
      erk $$3 = $$0.b_($$1.d());
      return $$2.a() == erl.c && $$3.a() == erl.a;
   }

   private void a(arn $$0, jh $$1, azs $$2) {
      this.a((dfb)$$0, $$1);
      $$0.a(null, $$1, awl.jJ, awm.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dfb $$0, jh $$1) {
      $$0.b($$1, false);
   }

   private void b(arn $$0, jh $$1, azs $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cio $$5 = bul.ba.a($$0, buk.e);
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

   private double b(azs $$0) {
      double $$1 = 0.2F;
      return azk.a($$0.j(), 0.2F, 0.7999999970197678);
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
