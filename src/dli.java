import com.mojang.serialization.MapCodec;

public class dli extends dlk {
   public static final MapCodec<dli> a = b(dli::new);
   private static final ffc c = dma.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dli> a() {
      return a;
   }

   protected dli(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }
}
