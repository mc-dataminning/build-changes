import com.mojang.serialization.MapCodec;

public class dhj extends dhw {
   public static final MapCodec<dhj> a = b(dhj::new);
   protected static final ewl b = dfa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      this.d($$0, $$1, $$2);
      return bqv.a($$1.B);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dsd $$0, dbz $$1, iz $$2) {
      dtu $$3 = $$1.C_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         iz $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = ayz.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = ayz.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = ayz.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
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
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
