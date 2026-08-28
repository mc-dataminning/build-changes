import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dwx extends dww.a {
   public static final Codec<dwx> a = a(mb.e.q(), djm::m).stable();

   public dwx(djm $$0, Reference2ObjectArrayMap<dxz<?>, Comparable<?>> $$1, MapCodec<dwx> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dwx B() {
      return this;
   }
}
