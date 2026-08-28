import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dsk extends dsj.a {
   public static final Codec<dsk> b = a(lq.e.r(), dfh::o).stable();

   public dsk(dfh $$0, Reference2ObjectArrayMap<dtn<?>, Comparable<?>> $$1, MapCodec<dsk> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsk x() {
      return this;
   }
}
