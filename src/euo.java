import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euo {
   private static final Codec<eun> d = lq.H.r().dispatch(eun::a, eum::a);
   public static final Codec<eun> a = Codec.lazyInitialized(
      () -> Codec.either(eul.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eul $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eum b = a("storage", eup.a);
   public static final eum c = a("context", eul.b);

   private static eum a(String $$0, MapCodec<? extends eun> $$1) {
      return jw.a(lq.H, new akk($$0), new eum($$1));
   }
}
