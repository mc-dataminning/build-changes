import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class drd extends drc.a {
   public static final Codec<drd> b = a(le.e.q(), dea::n).stable();

   public drd(dea $$0, Reference2ObjectArrayMap<dsg<?>, Comparable<?>> $$1, MapCodec<drd> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drd x() {
      return this;
   }
}
