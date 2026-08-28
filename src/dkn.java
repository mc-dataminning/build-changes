import com.mojang.serialization.MapCodec;

public class dkn extends dkz {
   public static final MapCodec<dkn> a = b(dkn::new);
   protected static final fah b = die.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      this.e($$0, $$1, $$2);
      return bsd.a;
   }

   @Override
   protected void a_(dvj $$0, dfb $$1, jh $$2, com $$3) {
      this.e($$0, $$1, $$2);
   }

   private void e(dvj $$0, dfb $$1, jh $$2) {
      dxa $$3 = $$1.C_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         jh $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = azk.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = azk.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = azk.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(lr.ac, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
               }
            } else {
               $$1.a($$5, $$0, 2);
               $$1.a($$2, false);
            }

            return;
         }
      }
   }

   @Override
   protected int b() {
      return 5;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
