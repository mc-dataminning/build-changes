import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class ebe extends ebd.a {
   public static final Codec<ebe> a = a(mg.e.q(), dnc::m).stable();

   public ebe(dnc $$0, Reference2ObjectArrayMap<ech<?>, Comparable<?>> $$1, MapCodec<ebe> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebe B() {
      return this;
   }
}
