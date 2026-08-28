import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dxv extends dxu.a {
   public static final Codec<dxv> a = a(ma.e.q(), dkm::m).stable();

   public dxv(dkm $$0, Reference2ObjectArrayMap<dyx<?>, Comparable<?>> $$1, MapCodec<dxv> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxv B() {
      return this;
   }
}
