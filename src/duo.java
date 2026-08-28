import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class duo extends dun.a {
   public static final Codec<duo> a = a(lu.e.q(), dhj::o).stable();

   public duo(dhj $$0, Reference2ObjectArrayMap<dvr<?>, Comparable<?>> $$1, MapCodec<duo> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected duo B() {
      return this;
   }
}
