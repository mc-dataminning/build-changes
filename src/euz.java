import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euz {
   private static final Codec<euy> d = lp.K.q().dispatch(euy::a, eux::a);
   public static final Codec<euy> a = Codec.lazyInitialized(
      () -> Codec.either(euv.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof euv $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eux b = a("fixed", euw.a);
   public static final eux c = a("context", euv.a);

   private static eux a(String $$0, MapCodec<? extends euy> $$1) {
      return jv.a(lp.K, new alf($$0), new eux($$1));
   }
}
