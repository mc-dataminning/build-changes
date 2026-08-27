import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dfj extends dfi.a {
   public static final Codec<dfj> b = a(jd.f.q(), csv::n).stable();

   public dfj(csv $$0, ImmutableMap<dgm<?>, Comparable<?>> $$1, MapCodec<dfj> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dfj x() {
      return this;
   }
}
