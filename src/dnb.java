import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dnb extends dna.a {
   public static final Codec<dnb> b = a(ki.e.q(), dac::o).stable();

   public dnb(dac $$0, Reference2ObjectArrayMap<doe<?>, Comparable<?>> $$1, MapCodec<dnb> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dnb x() {
      return this;
   }
}
