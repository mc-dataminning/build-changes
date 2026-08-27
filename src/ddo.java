import com.mojang.serialization.MapCodec;

public class ddo extends cvz {
   public static final MapCodec<ddo> a = b(ddo::new);
   private static final elu b = cvz.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   public ddo(dio.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return cvz.a($$1, $$2.c(), ia.a) && !$$1.y($$2);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.b && !this.a($$0, $$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(jv.aw, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      hv.a $$10 = new hv.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + aty.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + aty.a($$3, -10, 10));
         dip $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(jv.aA, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }
}
