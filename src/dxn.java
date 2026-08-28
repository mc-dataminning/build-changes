import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dxn extends dxm.a {
   public static final Codec<dxn> a = a(ma.e.q(), dke::m).stable();

   public dxn(dke $$0, Reference2ObjectArrayMap<dyp<?>, Comparable<?>> $$1, MapCodec<dxn> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxn B() {
      return this;
   }
}
