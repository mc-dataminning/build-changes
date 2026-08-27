import com.mojang.serialization.MapCodec;

public class djw extends dch {
   public static final MapCodec<djw> a = b(djw::new);
   private static final etc b = dch.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return dch.a($$1, $$2.c(), ij.a) && !$$1.z($$2);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.b && !this.a($$0, $$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(kn.ax, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      id.a $$10 = new id.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + axm.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + axm.a($$3, -10, 10));
         dpi $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(kn.aB, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }
}
