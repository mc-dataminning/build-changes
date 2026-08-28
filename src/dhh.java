import com.mojang.serialization.MapCodec;

public class dhh extends dhu {
   public static final MapCodec<dhh> a = b(dhh::new);
   protected static final ewj b = dey.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      this.d($$0, $$1, $$2);
      return bqt.a($$1.B);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, cmw $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dsb $$0, dbx $$1, iz $$2) {
      dts $$3 = $$1.C_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         iz $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = ayy.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = ayy.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = ayy.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(li.ac, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
