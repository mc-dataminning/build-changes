import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dwy extends dwx.a {
   public static final Codec<dwy> a = a(mb.e.q(), djn::m).stable();

   public dwy(djn $$0, Reference2ObjectArrayMap<dya<?>, Comparable<?>> $$1, MapCodec<dwy> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dwy B() {
      return this;
   }
}
