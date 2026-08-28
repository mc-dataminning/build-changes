import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dzz extends dzy.a {
   public static final Codec<dzz> a = a(mf.e.q(), dma::m).stable();

   public dzz(dma $$0, Reference2ObjectArrayMap<ebc<?>, Comparable<?>> $$1, MapCodec<dzz> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzz B() {
      return this;
   }
}
