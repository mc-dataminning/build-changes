import com.mojang.serialization.MapCodec;

public class dcu extends cvf {
   public static final MapCodec<dcu> a = b(dcu::new);
   private static final eks b = cvf.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dcu> a() {
      return a;
   }

   public dcu(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return cvf.a($$1, $$2.c(), ib.a) && !$$1.y($$2);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.b && !this.a($$0, $$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(jw.au, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      hx.a $$10 = new hx.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + atq.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + atq.a($$3, -10, 10));
         dhn $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(jw.ay, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }
}
