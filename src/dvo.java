import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dvo extends dvn.a {
   public static final Codec<dvo> a = a(lz.e.q(), dij::m).stable();

   public dvo(dij $$0, Reference2ObjectArrayMap<dwq<?>, Comparable<?>> $$1, MapCodec<dvo> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvo B() {
      return this;
   }
}
