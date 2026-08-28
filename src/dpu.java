import com.mojang.serialization.MapCodec;

public class dpu extends die {
   public static final MapCodec<dpu> a = b(dpu::new);
   private static final fah b = die.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return die.a($$1, $$2.d(), jm.a) && !$$1.z($$2);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.b && !this.a($$0, $$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lr.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jh.a $$10 = new jh.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azk.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azk.a($$3, -10, 10));
         dvj $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lr.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }
}
