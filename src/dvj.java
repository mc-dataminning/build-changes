import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dvj extends dvi.a {
   public static final Codec<dvj> a = a(ly.e.q(), die::m).stable();

   public dvj(die $$0, Reference2ObjectArrayMap<dwm<?>, Comparable<?>> $$1, MapCodec<dvj> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvj B() {
      return this;
   }
}
