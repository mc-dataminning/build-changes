import com.mojang.serialization.MapCodec;

public class dos extends dvr {
   public static final MapCodec<dos> a = b(dos::new);
   private static final ffk b = dmf.b(12.0, 0.0, 13.0);
   private static final int c = 150;
   private static final int d = 5;

   @Override
   public MapCodec<? extends dos> a() {
      return a;
   }

   protected dos(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(axc.cq);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$3.a(150) == 0) {
         eah $$4 = $$1.a_($$2.e());
         if (($$4.a(dmh.N) || $$4.a(axc.ai)) && $$3.a(5) != 0) {
            return;
         }

         eah $$5 = $$1.a_($$2.c(2));
         if ($$4.a(axc.cG) && $$5.a(axc.cG)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gS, awo.e, 1.0F, 1.0F, false);
         }
      }
   }
}
