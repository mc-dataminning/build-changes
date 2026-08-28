import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dxu extends dxt.a {
   public static final Codec<dxu> a = a(ma.e.q(), dkl::m).stable();

   public dxu(dkl $$0, Reference2ObjectArrayMap<dyw<?>, Comparable<?>> $$1, MapCodec<dxu> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxu B() {
      return this;
   }
}
