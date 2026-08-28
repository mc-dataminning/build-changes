import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euw {
   private static final Codec<euv> d = lq.H.r().dispatch(euv::a, euu::a);
   public static final Codec<euv> a = Codec.lazyInitialized(
      () -> Codec.either(eut.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eut $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final euu b = a("storage", eux.a);
   public static final euu c = a("context", eut.b);

   private static euu a(String $$0, MapCodec<? extends euv> $$1) {
      return jw.a(lq.H, new akk($$0), new euu($$1));
   }
}
