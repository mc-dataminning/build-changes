import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class eah extends eag.a {
   public static final Codec<eah> a = a(mf.e.q(), dmf::m).stable();

   public eah(dmf $$0, Reference2ObjectArrayMap<ebk<?>, Comparable<?>> $$1, MapCodec<eah> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eah B() {
      return this;
   }
}
