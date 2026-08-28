import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dta extends dsz.a {
   public static final Codec<dta> b = a(lt.e.r(), dfw::o).stable();

   public dta(dfw $$0, Reference2ObjectArrayMap<dud<?>, Comparable<?>> $$1, MapCodec<dta> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dta x() {
      return this;
   }
}
