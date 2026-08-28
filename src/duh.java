import com.mojang.serialization.MapCodec;

public class duh extends dma {
   public static final MapCodec<duh> a = b(duh::new);
   private static final ffc b = dma.a(6.0);

   @Override
   public MapCodec<duh> a() {
      return a;
   }

   protected duh(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected float c(dzz $$0, dib $$1, iu $$2) {
      return 1.0F;
   }
}
