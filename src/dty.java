import com.mojang.serialization.MapCodec;

public class dty extends dma {
   public static final MapCodec<dty> a = b(dty::new);
   private static final ffc b = dma.b(12.0, 13.0, 16.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dty> a() {
      return a;
   }

   public dty(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return dma.a($$1, $$2.d(), ja.a) && !$$1.A($$2);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.b && !this.a($$0, $$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lx.aC, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      iu.a $$10 = new iu.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azm.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azm.a($$3, -10, 10));
         dzz $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lx.aG, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }
}
