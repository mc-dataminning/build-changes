import com.mojang.serialization.MapCodec;

public class djv extends dki {
   public static final MapCodec<djv> a = b(djv::new);
   protected static final ezq b = dhm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      this.d($$0, $$1, $$2);
      return brs.a;
   }

   @Override
   protected void a_(dus $$0, dej $$1, jf $$2, cnx $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dus $$0, dej $$1, jf $$2) {
      dwj $$3 = $$1.B_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         jf $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = azf.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = azf.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = azf.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(lo.ac, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
