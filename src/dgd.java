import com.mojang.serialization.MapCodec;

public class dgd extends cyo {
   public static final MapCodec<dgd> a = b(dgd::new);
   private static final eol b = cyo.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dle.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return cyo.a($$1, $$2.c(), ie.a) && !$$1.z($$2);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.b && !this.a($$0, $$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(jz.aw, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      hz.a $$10 = new hz.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + awh.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + awh.a($$3, -10, 10));
         dlf $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(jz.aA, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }
}
