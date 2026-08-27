import com.mojang.serialization.MapCodec;

public class dbo extends dcb {
   public static final MapCodec<dbo> a = b(dbo::new);
   protected static final epo b = czf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dbo> a() {
      return a;
   }

   public dbo(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      this.d($$0, $$1, $$2);
      return bml.a($$1.B);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cia $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dme $$0, cwe $$1, ib $$2) {
      dnv $$3 = $$1.D_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         ib $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = awm.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = awm.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = awm.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(kb.Z, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
