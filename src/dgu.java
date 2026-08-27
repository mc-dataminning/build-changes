import com.mojang.serialization.MapCodec;

public class dgu extends czf {
   public static final MapCodec<dgu> a = b(dgu::new);
   private static final epo b = czf.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dgu> a() {
      return a;
   }

   public dgu(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return czf.a($$1, $$2.c(), ih.a) && !$$1.z($$2);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.b && !this.a($$0, $$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(kb.aw, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ib.a $$10 = new ib.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + awm.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + awm.a($$3, -10, 10));
         dme $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(kb.aA, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }
}
