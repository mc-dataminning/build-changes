import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dey extends dex.a {
   public static final Codec<dey> b = a(jc.f.q(), csk::n).stable();

   public dey(csk $$0, ImmutableMap<dgb<?>, Comparable<?>> $$1, MapCodec<dey> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dey x() {
      return this;
   }
}
