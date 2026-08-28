import com.mojang.serialization.MapCodec;

public class dif extends dis {
   public static final MapCodec<dif> a = b(dif::new);
   protected static final exp b = dfw.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   public dif(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      this.d($$0, $$1, $$2);
      return bqq.a($$1.B);
   }

   @Override
   protected void a_(dta $$0, dcu $$1, jd $$2, cmv $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dta $$0, dcu $$1, jd $$2) {
      dur $$3 = $$1.C_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         jd $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = ayn.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = ayn.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = ayn.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(lm.ac, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
