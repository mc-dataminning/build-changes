import com.mojang.serialization.MapCodec;

public class dpm extends dqa {
   public static final MapCodec<dpm> a = b(dpm::new);
   private static final fgk b = dnc.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      this.d($$0, $$1, $$2);
      return bur.a;
   }

   @Override
   protected void a_(ebe $$0, djx $$1, iv $$2, crx $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(ebe $$0, djx $$1, iv $$2) {
      ecw $$3 = $$1.E_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         iv $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = azo.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = azo.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = azo.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(ly.af, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   public int b(ebe $$0, djb $$1, iv $$2) {
      return -16777216;
   }
}
