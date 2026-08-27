import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dhn extends dhm.a {
   public static final Codec<dhn> b = a(kc.f.q(), cvf::o).stable();

   public dhn(cvf $$0, ImmutableMap<diq<?>, Comparable<?>> $$1, MapCodec<dhn> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dhn x() {
      return this;
   }
}
