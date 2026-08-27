import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dgw extends dgv.a {
   public static final Codec<dgw> b = a(jy.f.q(), cut::o).stable();

   public dgw(cut $$0, ImmutableMap<dhz<?>, Comparable<?>> $$1, MapCodec<dgw> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dgw x() {
      return this;
   }
}
