import com.mojang.serialization.MapCodec;

public class dpb extends dpp {
   public static final MapCodec<dpb> a = b(dpb::new);
   private static final ffw b = dmr.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   public dpb(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      this.d($$0, $$1, $$2);
      return bug.a;
   }

   @Override
   protected void a_(eat $$0, djm $$1, iv $$2, crm $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(eat $$0, djm $$1, iv $$2) {
      ecl $$3 = $$1.A_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         iv $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = azm.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = azm.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = azm.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
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
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   public int b(eat $$0, diq $$1, iv $$2) {
      return -16777216;
   }
}
