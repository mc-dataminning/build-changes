import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dmz extends dmy.a {
   public static final Codec<dmz> b = a(ki.e.q(), daa::o).stable();

   public dmz(daa $$0, Reference2ObjectArrayMap<doc<?>, Comparable<?>> $$1, MapCodec<dmz> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dmz x() {
      return this;
   }
}
