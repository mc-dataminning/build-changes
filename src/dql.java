import com.mojang.serialization.MapCodec;

public class dql extends die {
   public static final MapCodec<dql> a = b(dql::new);
   private static final dwj b = dvz.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      int $$4 = a((dfc)$$0, $$1, $$2, (bue)$$3);
      if ($$3.s() instanceof aro $$6) {
         $$6.a(awv.aE);
         ao.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dfc $$0, dvj $$1, ezj $$2, bue $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cou ? 20 : 8;
      if (!$$0.R().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(ezj $$0, ezn $$1) {
      jm $$2 = $$0.c();
      double $$3 = Math.abs(azk.e($$1.d) - 0.5);
      double $$4 = Math.abs(azk.e($$1.e) - 0.5);
      double $$5 = Math.abs(azk.e($$1.f) - 0.5);
      jm.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jm.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jm.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azk.c(15.0 * azk.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dfc $$0, dvj $$1, int $$2, jh $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
