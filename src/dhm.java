import com.mojang.serialization.MapCodec;

public class dhm extends dib {
   public static final MapCodec<dhm> a = b(dhm::new);
   protected static final exn b = dfc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   public dhm(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      this.d($$0, $$1, $$2);
      return bqa.a($$1.C);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dtc $$0, dca $$1, ir $$2) {
      dut $$3 = $$1.D_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         ir $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = aym.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = aym.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = aym.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(lb.aa, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
