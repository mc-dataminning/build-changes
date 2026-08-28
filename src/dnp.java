import com.mojang.serialization.MapCodec;

public class dnp extends dfy {
   public static final MapCodec<dnp> a = b(dnp::new);
   private static final ext b = dfy.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return dfy.a($$1, $$2.d(), ji.a) && !$$1.z($$2);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.b && !this.a($$0, $$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lm.az, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jd.a $$10 = new jd.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayo.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayo.a($$3, -10, 10));
         dtc $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(lm.aD, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }
}
