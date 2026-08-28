import com.mojang.serialization.MapCodec;

public class dlj extends dlk {
   public static final MapCodec<dlj> a = b(dlj::new);
   private static final ffc c = dma.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }
}
