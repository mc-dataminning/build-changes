import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dqh extends dqg.a {
   public static final Codec<dqh> b = a(ld.e.q(), dde::n).stable();

   public dqh(dde $$0, Reference2ObjectArrayMap<drk<?>, Comparable<?>> $$1, MapCodec<dqh> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dqh x() {
      return this;
   }
}
