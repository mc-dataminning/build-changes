import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dus extends dur.a {
   public static final Codec<dus> a = a(lv.e.q(), dhm::n).stable();

   public dus(dhm $$0, Reference2ObjectArrayMap<dvv<?>, Comparable<?>> $$1, MapCodec<dus> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dus B() {
      return this;
   }
}
