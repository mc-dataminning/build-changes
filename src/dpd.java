import com.mojang.serialization.MapCodec;

public class dpd extends dhm {
   public static final MapCodec<dpd> a = b(dpd::new);
   private static final ezq b = dhm.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(dur.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return dhm.a($$1, $$2.d(), jk.a) && !$$1.z($$2);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.b && !this.a($$0, $$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lo.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jf.a $$10 = new jf.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + azf.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + azf.a($$3, -10, 10));
         dus $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lo.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }
}
