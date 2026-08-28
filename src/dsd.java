import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dsd extends dsc.a {
   public static final Codec<dsd> b = a(lp.e.q(), dfa::o).stable();

   public dsd(dfa $$0, Reference2ObjectArrayMap<dtg<?>, Comparable<?>> $$1, MapCodec<dsd> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsd x() {
      return this;
   }
}
