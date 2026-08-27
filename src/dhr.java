import com.mojang.serialization.MapCodec;

public class dhr extends dac {
   public static final MapCodec<dhr> a = b(dhr::new);
   private static final eqm b = dac.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   public dhr(dna.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return dac.a($$1, $$2.c(), ih.a) && !$$1.z($$2);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.b && !this.a($$0, $$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
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
         dnb $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(kc.aB, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }
}
