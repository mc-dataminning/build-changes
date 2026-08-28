import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dtc extends dtb.a {
   public static final Codec<dtc> b = a(lt.e.r(), dfy::o).stable();

   public dtc(dfy $$0, Reference2ObjectArrayMap<duf<?>, Comparable<?>> $$1, MapCodec<dtc> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dtc x() {
      return this;
   }
}
