import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dvd extends dvc.a {
   public static final Codec<dvd> a = a(lx.e.q(), dhy::m).stable();

   public dvd(dhy $$0, Reference2ObjectArrayMap<dwg<?>, Comparable<?>> $$1, MapCodec<dvd> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dvd B() {
      return this;
   }
}
