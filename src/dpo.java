import com.mojang.serialization.MapCodec;

public class dpo extends dqc {
   public static final MapCodec<dpo> a = b(dpo::new);
   private static final fgm b = dne.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      this.d($$0, $$1, $$2);
      return but.a;
   }

   @Override
   protected void a_(ebg $$0, djz $$1, iw $$2, crz $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(ebg $$0, djz $$1, iw $$2) {
      ecy $$3 = $$1.E_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         iw $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = azq.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = azq.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = azq.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(lz.af, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   public int b(ebg $$0, djd $$1, iw $$2) {
      return -16777216;
   }
}
