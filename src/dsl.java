import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dsl extends dsk.a {
   public static final Codec<dsl> b = a(lq.e.r(), dfi::o).stable();

   public dsl(dfi $$0, Reference2ObjectArrayMap<dto<?>, Comparable<?>> $$1, MapCodec<dsl> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsl x() {
      return this;
   }
}
