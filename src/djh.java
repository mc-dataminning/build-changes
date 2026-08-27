import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class djh extends djg.a {
   public static final Codec<djh> b = a(kd.e.q(), cwq::o).stable();

   public djh(cwq $$0, ImmutableMap<dkk<?>, Comparable<?>> $$1, MapCodec<djh> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected djh x() {
      return this;
   }
}
