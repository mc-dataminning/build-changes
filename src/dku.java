import com.mojang.serialization.MapCodec;

public class dku extends dde {
   public static final MapCodec<dku> a = b(dku::new);
   private static final eui b = dde.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return dde.a($$1, $$2.c(), is.a) && !$$1.z($$2);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.b && !this.a($$0, $$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(kx.aw, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      in.a $$10 = new in.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + axz.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + axz.a($$3, -10, 10));
         dqh $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(kx.aA, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }
}
