import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class eao extends ean.a {
   public static final Codec<eao> a = a(mg.e.q(), dmm::m).stable();

   public eao(dmm $$0, Reference2ObjectArrayMap<ebr<?>, Comparable<?>> $$1, MapCodec<eao> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eao B() {
      return this;
   }
}
