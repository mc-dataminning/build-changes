import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eta {
   private static final Codec<esz> d = le.J.q().dispatch(esz::a, esy::a);
   public static final Codec<esz> a = Codec.lazyInitialized(
      () -> Codec.either(esx.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof esx $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final esy b = a("storage", etb.a);
   public static final esy c = a("context", esx.b);

   private static esy a(String $$0, MapCodec<? extends esz> $$1) {
      return jk.a(le.J, new akm($$0), new esy($$1));
   }
}
