import com.mojang.serialization.MapCodec;

public class dre extends dma {
   public static final MapCodec<dre> a = b(dre::new);
   private static final ffc b = dma.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      return fez.b();
   }

   @Override
   protected ffc c(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.b();
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected float c(dzz $$0, dib $$1, iu $$2) {
      return 0.2F;
   }
}
