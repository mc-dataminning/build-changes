import com.mojang.serialization.MapCodec;

public class dcp extends cva {
   public static final MapCodec<dcp> a = b(dcp::new);
   private static final ekn b = cva.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dcp(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return cva.a($$1, $$2.c(), hx.a) && !$$1.y($$2);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.b && !this.a($$0, $$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(js.au, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ht.a $$10 = new ht.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + atm.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + atm.a($$3, -10, 10));
         dhi $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(js.ay, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }
}
