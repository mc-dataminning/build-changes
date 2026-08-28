import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dse extends dsd.a {
   public static final Codec<dse> b = a(lp.e.q(), dfb::o).stable();

   public dse(dfb $$0, Reference2ObjectArrayMap<dth<?>, Comparable<?>> $$1, MapCodec<dse> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dse x() {
      return this;
   }
}
