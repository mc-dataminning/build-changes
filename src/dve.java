import com.mojang.serialization.MapCodec;

public class dve extends dne {
   public static final MapCodec<dve> a = b(dve::new);
   private static final fgm b = dne.b(12.0, 13.0, 16.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dve> a() {
      return a;
   }

   public dve(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return dne.a($$1, $$2.d(), jc.a) && !$$1.A($$2);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.b && !this.a($$0, $$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lz.aC, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      iw.a $$10 = new iw.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azq.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azq.a($$3, -10, 10));
         ebg $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lz.aG, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }
}
