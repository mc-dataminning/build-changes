import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dcb extends dca.a {
   public static final Codec<dcb> b = a(jb.f.q(), cpn::n).stable();

   public dcb(cpn $$0, ImmutableMap<dde<?>, Comparable<?>> $$1, MapCodec<dcb> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dcb x() {
      return this;
   }
}
