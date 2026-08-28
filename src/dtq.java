import com.mojang.serialization.MapCodec;

public class dtq extends dlu {
   public static final MapCodec<dtq> a = b(dtq::new);
   private static final feq b = dlu.b(12.0, 13.0, 16.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dtq> a() {
      return a;
   }

   public dtq(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return dlu.a($$1, $$2.d(), ja.a) && !$$1.A($$2);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.b && !this.a($$0, $$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lx.aC, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      iu.a $$10 = new iu.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azk.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azk.a($$3, -10, 10));
         dzo $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lx.aG, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }
}
