import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dip extends dio.a {
   public static final Codec<dip> b = a(kb.e.q(), cvz::o).stable();

   public dip(cvz $$0, ImmutableMap<djs<?>, Comparable<?>> $$1, MapCodec<dip> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dip x() {
      return this;
   }
}
