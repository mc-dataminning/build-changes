import com.mojang.serialization.MapCodec;

public class dok extends dox {
   public static final MapCodec<dok> a = b(dok::new);
   private static final ffc b = dma.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      this.d($$0, $$1, $$2);
      return bub.a;
   }

   @Override
   protected void a_(dzz $$0, div $$1, iu $$2, cqy $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dzz $$0, div $$1, iu $$2) {
      ebr $$3 = $$1.A_();

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
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   public int b(dzz $$0, dib $$1, iu $$2) {
      return -16777216;
   }
}
