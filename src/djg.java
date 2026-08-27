import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class djg extends djf.a {
   public static final Codec<djg> b = a(kd.e.q(), cwp::o).stable();

   public djg(cwp $$0, ImmutableMap<dkj<?>, Comparable<?>> $$1, MapCodec<djg> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected djg x() {
      return this;
   }
}
