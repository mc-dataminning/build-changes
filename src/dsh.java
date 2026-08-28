import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dsh extends dsg.a {
   public static final Codec<dsh> b = a(lq.e.r(), dff::o).stable();

   public dsh(dff $$0, Reference2ObjectArrayMap<dtk<?>, Comparable<?>> $$1, MapCodec<dsh> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsh x() {
      return this;
   }
}
