import com.mojang.serialization.MapCodec;

public class dsq extends dku {
   public static final MapCodec<dsq> a = b(dsq::new);
   private static final fdo b = dku.b(12.0, 13.0, 16.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   public dsq(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return dku.a($$1, $$2.d(), jo.a) && !$$1.z($$2);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.b && !this.a($$0, $$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lv.aC, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jj.a $$10 = new jj.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azk.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azk.a($$3, -10, 10));
         dym $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lv.aG, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }
}
