import com.mojang.serialization.MapCodec;

public class dhr extends die {
   public static final MapCodec<dhr> a = b(dhr::new);
   protected static final exa b = dfi.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   public dhr(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      this.d($$0, $$1, $$2);
      return bqh.a($$1.B);
   }

   @Override
   protected void a_(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dsl $$0, dcg $$1, ja $$2) {
      duc $$3 = $$1.C_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         ja $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = ayg.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = ayg.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = ayg.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(lj.ac, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
