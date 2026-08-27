import com.mojang.serialization.Codec;

public class eca extends ecb {
   public static final Codec<eca> a = Codec.unit(() -> eca.b);
   public static final eca b = new eca();

   private eca() {
   }

   @Override
   public boolean a(hv $$0, hv $$1, hv $$2, auf $$3) {
      return true;
   }

   @Override
   protected ecc<?> a() {
      return ecc.a;
   }
}
