import com.mojang.serialization.MapCodec;

public class dbo extends cua {
   public static final MapCodec<dbo> a = b(dbo::new);
   private static final eiy b = cua.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dbo> a() {
      return a;
   }

   public dbo(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return cua.a($$1, $$2.c(), hx.a) && !$$1.y($$2);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.b && !this.a($$0, $$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(js.at, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ht.a $$10 = new ht.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + asy.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + asy.a($$3, -10, 10));
         dgb $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(js.ax, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }
}
