import com.mojang.serialization.MapCodec;

public class doa extends dvj {
   public static final MapCodec<doa> a = b(doa::new);
   private static final ffc b = dma.b(12.0, 0.0, 13.0);
   private static final int c = 150;
   private static final int d = 5;

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   protected doa(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(axc.cp);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$3.a(150) == 0) {
         dzz $$4 = $$1.a_($$2.e());
         if (($$4.a(dmc.N) || $$4.a(axc.ai)) && $$3.a(5) != 0) {
            return;
         }

         dzz $$5 = $$1.a_($$2.c(2));
         if ($$4.a(axc.cF) && $$5.a(axc.cF)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gQ, awo.e, 1.0F, 1.0F, false);
         }
      }
   }
}
