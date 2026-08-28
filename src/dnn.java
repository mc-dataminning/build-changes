import com.mojang.serialization.MapCodec;

public class dnn extends dfw {
   public static final MapCodec<dnn> a = b(dnn::new);
   private static final exp b = dfw.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return dfw.a($$1, $$2.c(), ji.a) && !$$1.z($$2);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.b && !this.a($$0, $$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lm.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jd.a $$10 = new jd.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayn.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayn.a($$3, -10, 10));
         dta $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(lm.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }
}
