import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dkn extends dhj {
   public static final MapCodec<dkn> a = b(dkn::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.C_()));
   }

   private static int a(azl $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return !this.a($$0, $$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((deg)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$3.ao().equals(btv.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(ddl $$0, je $$1) {
      eqp $$2 = $$0.b_($$1);
      eqp $$3 = $$0.b_($$1.d());
      return $$2.a() == eqq.c && $$3.a() == eqq.a;
   }

   private void a(arh $$0, je $$1, azl $$2) {
      this.a((deg)$$0, $$1);
      $$0.a(null, $$1, awe.jJ, awf.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(deg $$0, je $$1) {
      $$0.b($$1, false);
   }

   private void b(arh $$0, je $$1, azl $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         chx $$5 = btv.ba.a($$0, btu.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fW();
            $$0.b($$5);
         }
      }
   }

   private double b(azl $$0) {
      double $$1 = 0.2F;
      return azd.a($$0.j(), 0.2F, 0.7999999970197678);
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
