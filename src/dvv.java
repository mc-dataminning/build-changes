import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dvv extends dvu.a {
   public static final Codec<dvv> a = a(lz.e.q(), diq::m).stable();

   public dvv(diq $$0, Reference2ObjectArrayMap<dwx<?>, Comparable<?>> $$1, MapCodec<dvv> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvv B() {
      return this;
   }
}
