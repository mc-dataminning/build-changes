import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dsb extends dsa.a {
   public static final Codec<dsb> b = a(lp.e.q(), dey::o).stable();

   public dsb(dey $$0, Reference2ObjectArrayMap<dte<?>, Comparable<?>> $$1, MapCodec<dsb> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsb x() {
      return this;
   }
}
