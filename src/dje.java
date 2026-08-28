import com.mojang.serialization.MapCodec;

public class dje extends djr {
   public static final MapCodec<dje> a = b(dje::new);
   protected static final eyx b = dgv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      this.d($$0, $$1, $$2);
      return brk.a;
   }

   @Override
   protected void a_(dua $$0, dds $$1, je $$2, cnp $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dua $$0, dds $$1, je $$2) {
      dvr $$3 = $$1.A_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         je $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = azc.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = azc.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = azc.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(ln.ac, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
