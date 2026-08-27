import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class djp extends djo.a {
   public static final Codec<djp> b = a(kd.e.q(), cwy::o).stable();

   public djp(cwy $$0, ImmutableMap<dks<?>, Comparable<?>> $$1, MapCodec<djp> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected djp x() {
      return this;
   }
}
