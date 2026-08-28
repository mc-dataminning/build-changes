import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dxo extends dxn.a {
   public static final Codec<dxo> a = a(ma.e.q(), dkd::m).stable();

   public dxo(dkd $$0, Reference2ObjectArrayMap<dyq<?>, Comparable<?>> $$1, MapCodec<dxo> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxo B() {
      return this;
   }
}
