import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dgi extends dde {
   public static final MapCodec<dgi> a = b(dgi::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eui b = dde.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public dgi(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ayg $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return !this.a($$0, $$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dad)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if ($$3.ai().equals(brn.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(czj $$0, in $$1) {
      ema $$2 = $$0.b_($$1);
      ema $$3 = $$0.b_($$1.c());
      return $$2.a() == emb.c && $$3.a() == emb.a;
   }

   private void a(aqh $$0, in $$1, ayg $$2) {
      this.a((dad)$$0, $$1);
      $$0.a(null, $$1, avc.jD, avd.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dad $$0, in $$1) {
      $$0.b($$1, false);
   }

   private void b(aqh $$0, in $$1, ayg $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cfm $$5 = brn.aZ.a((dad)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fT();
            $$0.b($$5);
         }
      }
   }

   private double b(ayg $$0) {
      double $$1 = (double)(cfm.c / 2.0F);
      return axz.a($$0.j(), $$1, 1.0 - $$1);
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
