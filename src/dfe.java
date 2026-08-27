import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dfe extends dfd.a {
   public static final Codec<dfe> b = a(jd.f.q(), csq::n).stable();

   public dfe(csq $$0, ImmutableMap<dgh<?>, Comparable<?>> $$1, MapCodec<dfe> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dfe x() {
      return this;
   }
}
