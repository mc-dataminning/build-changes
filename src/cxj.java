import com.mojang.serialization.MapCodec;

public class cxj extends cxw {
   public static final MapCodec<cxj> a = b(cxj::new);
   protected static final ekn b = cva.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cxj> a() {
      return a;
   }

   public cxj(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      this.d($$0, $$1, $$2);
      return bix.a($$1.B);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cdu $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dhi $$0, csa $$1, ht $$2) {
      diz $$3 = $$1.C_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         ht $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = atm.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = atm.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = atm.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(js.X, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
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
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
