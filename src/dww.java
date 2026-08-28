import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dww extends dwv.a {
   public static final Codec<dww> a = a(mb.e.q(), djl::m).stable();

   public dww(djl $$0, Reference2ObjectArrayMap<dxy<?>, Comparable<?>> $$1, MapCodec<dww> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dww B() {
      return this;
   }
}
