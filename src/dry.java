import com.mojang.serialization.MapCodec;

public class dry extends dkd {
   public static final MapCodec<dry> a = b(dry::new);
   private static final fcl b = dkd.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dry> a() {
      return a;
   }

   public dry(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return dkd.a($$1, $$2.d(), jm.a) && !$$1.z($$2);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(ls.aB, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jh.a $$10 = new jh.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azu.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azu.a($$3, -10, 10));
         dxo $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(ls.aF, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }
}
