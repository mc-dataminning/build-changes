import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dgb extends dga.a {
   public static final Codec<dgb> b = a(jy.f.q(), cua::o).stable();

   public dgb(cua $$0, ImmutableMap<dhe<?>, Comparable<?>> $$1, MapCodec<dgb> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dgb x() {
      return this;
   }
}
