import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class doz extends doy.a {
   public static final Codec<doz> b = a(kr.e.q(), dby::n).stable();

   public doz(dby $$0, Reference2ObjectArrayMap<dqc<?>, Comparable<?>> $$1, MapCodec<doz> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected doz x() {
      return this;
   }
}
