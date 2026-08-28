import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dym extends dyl.a {
   public static final Codec<dym> a = a(md.e.q(), dku::m).stable();

   public dym(dku $$0, Reference2ObjectArrayMap<dzp<?>, Comparable<?>> $$1, MapCodec<dym> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dym B() {
      return this;
   }
}
