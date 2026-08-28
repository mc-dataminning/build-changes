import com.mojang.serialization.MapCodec;

public class dqg extends diq {
   public static final MapCodec<dqg> a = b(dqg::new);
   private static final fas b = diq.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   public dqg(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return diq.a($$1, $$2.d(), jm.a) && !$$1.z($$2);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(ls.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jh.a $$10 = new jh.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azm.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azm.a($$3, -10, 10));
         dvv $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(ls.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }
}
