import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dpi extends dph.a {
   public static final Codec<dpi> b = a(kt.e.q(), dch::n).stable();

   public dpi(dch $$0, Reference2ObjectArrayMap<dql<?>, Comparable<?>> $$1, MapCodec<dpi> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dpi x() {
      return this;
   }
}
