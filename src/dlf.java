import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dlf extends dle.a {
   public static final Codec<dlf> b = a(kf.e.q(), cyo::o).stable();

   public dlf(cyo $$0, ImmutableMap<dmi<?>, Comparable<?>> $$1, MapCodec<dlf> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dlf x() {
      return this;
   }
}
