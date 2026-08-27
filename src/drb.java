import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class drb extends dra.a {
   public static final Codec<drb> b = a(le.e.q(), ddy::n).stable();

   public drb(ddy $$0, Reference2ObjectArrayMap<dse<?>, Comparable<?>> $$1, MapCodec<drb> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drb x() {
      return this;
   }
}
