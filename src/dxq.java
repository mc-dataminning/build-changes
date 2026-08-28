import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dxq extends dxp.a {
   public static final Codec<dxq> a = a(mb.e.q(), dke::m).stable();

   public dxq(dke $$0, Reference2ObjectArrayMap<dyt<?>, Comparable<?>> $$1, MapCodec<dxq> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dxq B() {
      return this;
   }
}
