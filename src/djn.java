import com.mojang.serialization.MapCodec;

public class djn extends dby {
   public static final MapCodec<djn> a = b(djn::new);
   private static final est b = dby.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   public djn(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return dby.a($$1, $$2.c(), ih.a) && !$$1.z($$2);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.b && !this.a($$0, $$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(kl.ax, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ib.a $$10 = new ib.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + axk.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + axk.a($$3, -10, 10));
         doz $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(kl.aB, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }
}
