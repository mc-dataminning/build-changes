import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dzo extends dzn.a {
   public static final Codec<dzo> a = a(mf.e.q(), dlu::m).stable();

   public dzo(dlu $$0, Reference2ObjectArrayMap<ear<?>, Comparable<?>> $$1, MapCodec<dzo> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzo B() {
      return this;
   }
}
