import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class ebg extends ebf.a {
   public static final Codec<ebg> a = a(mh.e.q(), dne::m).stable();

   public ebg(dne $$0, Reference2ObjectArrayMap<ecj<?>, Comparable<?>> $$1, MapCodec<ebg> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebg B() {
      return this;
   }
}
