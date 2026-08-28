import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dsc extends dsb.a {
   public static final Codec<dsc> b = a(lp.e.q(), dez::o).stable();

   public dsc(dez $$0, Reference2ObjectArrayMap<dtf<?>, Comparable<?>> $$1, MapCodec<dsc> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dsc x() {
      return this;
   }
}
