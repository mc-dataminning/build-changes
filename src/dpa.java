import com.mojang.serialization.MapCodec;

public class dpa extends dhj {
   public static final MapCodec<dpa> a = b(dpa::new);
   private static final ezm b = dhj.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   public dpa(dun.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return dhj.a($$1, $$2.d(), jj.a) && !$$1.z($$2);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.b && !this.a($$0, $$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(ln.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      je.a $$10 = new je.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azd.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azd.a($$3, -10, 10));
         duo $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(ln.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }
}
