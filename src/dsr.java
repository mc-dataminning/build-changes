import com.mojang.serialization.MapCodec;

public class dsr extends dvj {
   public static final MapCodec<dsr> a = b(dsr::new);
   private static final ffc b = dma.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   protected dsr(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(axc.aO) || $$0.a(dmc.el) || super.b($$0, $$1, $$2);
   }
}
