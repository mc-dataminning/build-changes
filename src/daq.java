import com.mojang.serialization.MapCodec;

public class daq extends ctc {
   public static final MapCodec<daq> a = b(daq::new);
   private static final eia b = ctc.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public daq(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return ctc.a($$1, $$2.c(), ha.a) && !$$1.y($$2);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.b && !this.a($$0, $$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(iv.at, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      gw.a $$10 = new gw.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + asb.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + asb.a($$3, -10, 10));
         dfd $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(iv.ax, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }
}
