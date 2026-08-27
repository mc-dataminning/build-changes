import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dja extends diz.a {
   public static final Codec<dja> b = a(kd.e.q(), cwj::o).stable();

   public dja(cwj $$0, ImmutableMap<dkd<?>, Comparable<?>> $$1, MapCodec<dja> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dja x() {
      return this;
   }
}
