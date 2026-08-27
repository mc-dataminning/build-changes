import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dhi extends dhh.a {
   public static final Codec<dhi> b = a(jy.f.q(), cva::o).stable();

   public dhi(cva $$0, ImmutableMap<dil<?>, Comparable<?>> $$1, MapCodec<dhi> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dhi x() {
      return this;
   }
}
