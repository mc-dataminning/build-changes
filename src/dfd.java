import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dfd extends dfc.a {
   public static final Codec<dfd> b = a(jb.f.q(), ctc::o).stable();

   public dfd(ctc $$0, ImmutableMap<dgg<?>, Comparable<?>> $$1, MapCodec<dfd> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dfd x() {
      return this;
   }
}
