import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class eat extends eas.a {
   public static final Codec<eat> a = a(mg.e.q(), dmr::m).stable();

   public eat(dmr $$0, Reference2ObjectArrayMap<ebw<?>, Comparable<?>> $$1, MapCodec<eat> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eat B() {
      return this;
   }
}
