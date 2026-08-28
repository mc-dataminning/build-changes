import com.mojang.serialization.MapCodec;

public class dmk extends deu {
   public static final MapCodec<dmk> a = b(dmk::new);
   private static final ewf b = deu.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(drw.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return deu.a($$1, $$2.c(), je.a) && !$$1.z($$2);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.b && !this.a($$0, $$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lj.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      iz.a $$10 = new iz.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayu.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayu.a($$3, -10, 10));
         drx $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(lj.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }
}
