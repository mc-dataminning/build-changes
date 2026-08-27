import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dfl extends dfk.a {
   public static final Codec<dfl> b = a(jd.f.q(), csx::n).stable();

   public dfl(csx $$0, ImmutableMap<dgo<?>, Comparable<?>> $$1, MapCodec<dfl> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dfl x() {
      return this;
   }
}
