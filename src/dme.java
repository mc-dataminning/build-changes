import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dme extends dmd.a {
   public static final Codec<dme> b = a(kh.e.q(), czf::o).stable();

   public dme(czf $$0, ImmutableMap<dnh<?>, Comparable<?>> $$1, MapCodec<dme> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dme x() {
      return this;
   }
}
