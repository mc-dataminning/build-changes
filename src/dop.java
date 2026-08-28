import com.mojang.serialization.MapCodec;

public class dop extends dpd {
   public static final MapCodec<dop> a = b(dop::new);
   private static final ffk b = dmf.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      this.d($$0, $$1, $$2);
      return bud.a;
   }

   @Override
   protected void a_(eah $$0, dja $$1, iu $$2, crc $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(eah $$0, dja $$1, iu $$2) {
      ebz $$3 = $$1.A_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         iu $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
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
                  $$1.a(lx.af, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   public int b(eah $$0, dig $$1, iu $$2) {
      return -16777216;
   }
}
