import com.mojang.serialization.MapCodec;

public class dlo extends ddy {
   public static final MapCodec<dlo> a = b(dlo::new);
   private static final evd b = ddy.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dra.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return ddy.a($$1, $$2.c(), it.a) && !$$1.z($$2);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.b && !this.a($$0, $$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(ky.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      io.a $$10 = new io.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayd.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayd.a($$3, -10, 10));
         drb $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(ky.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }
}
