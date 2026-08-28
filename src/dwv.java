import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dwv extends dwu.a {
   public static final Codec<dwv> a = a(mb.e.q(), djk::m).stable();

   public dwv(djk $$0, Reference2ObjectArrayMap<dxx<?>, Comparable<?>> $$1, MapCodec<dwv> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dwv B() {
      return this;
   }
}
