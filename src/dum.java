import com.mojang.serialization.MapCodec;

public class dum extends dmm {
   public static final MapCodec<dum> a = b(dum::new);
   private static final ffr b = dmm.b(12.0, 13.0, 16.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dum> a() {
      return a;
   }

   public dum(ean.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return dmm.a($$1, $$2.d(), jb.a) && !$$1.A($$2);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.b && !this.a($$0, $$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(ly.aC, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      iv.a $$10 = new iv.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azm.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azm.a($$3, -10, 10));
         eao $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(ly.aG, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }
}
