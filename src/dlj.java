import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dlj extends dli.a {
   public static final Codec<dlj> b = a(kf.e.q(), cys::o).stable();

   public dlj(cys $$0, ImmutableMap<dmm<?>, Comparable<?>> $$1, MapCodec<dlj> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dlj x() {
      return this;
   }
}
