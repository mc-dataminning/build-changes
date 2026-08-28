import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class drx extends drw.a {
   public static final Codec<drx> b = a(lp.e.q(), deu::n).stable();

   public drx(deu $$0, Reference2ObjectArrayMap<dta<?>, Comparable<?>> $$1, MapCodec<drx> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected drx x() {
      return this;
   }
}
