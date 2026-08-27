import com.mojang.serialization.MapCodec;

public class dng extends dfc {
   public static final MapCodec<dng> a = b(dng::new);
   private static final exn b = dfc.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return dfc.a($$1, $$2.c(), iw.a) && !$$1.z($$2);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.b && !this.a($$0, $$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lb.ay, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ir.a $$10 = new ir.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + aym.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + aym.a($$3, -10, 10));
         dtc $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(lb.aC, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }
}
