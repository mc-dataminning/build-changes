import com.mojang.serialization.MapCodec;

public class dmx extends dfh {
   public static final MapCodec<dmx> a = b(dmx::new);
   private static final ewy b = dfh.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return dfh.a($$1, $$2.c(), jf.a) && !$$1.z($$2);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.b && !this.a($$0, $$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lj.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ja.a $$10 = new ja.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayg.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayg.a($$3, -10, 10));
         dsk $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(lj.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }
}
