import com.mojang.serialization.MapCodec;

public class dhp extends daa {
   public static final MapCodec<dhp> a = b(dhp::new);
   private static final eqk b = daa.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return daa.a($$1, $$2.c(), ih.a) && !$$1.z($$2);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.b && !this.a($$0, $$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(kc.ax, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ib.a $$10 = new ib.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + aww.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + aww.a($$3, -10, 10));
         dmz $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(kc.aB, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }
}
