import com.mojang.serialization.MapCodec;

public class duy extends dpt {
   public static final MapCodec<duy> b = b(duy::new);

   protected duy(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends duy> a() {
      return b;
   }

   @Override
   protected ffc c(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.a();
   }

   @Override
   protected float c(dzz $$0, dib $$1, iu $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dzz $$0) {
      return true;
   }
}
