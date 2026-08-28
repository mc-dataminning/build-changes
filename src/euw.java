import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euw {
   private static final Codec<euv> d = lp.K.q().dispatch(euv::a, euu::a);
   public static final Codec<euv> a = Codec.lazyInitialized(
      () -> Codec.either(eus.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eus $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final euu b = a("fixed", eut.a);
   public static final euu c = a("context", eus.a);

   private static euu a(String $$0, MapCodec<? extends euv> $$1) {
      return jv.a(lp.K, new ale($$0), new euu($$1));
   }
}
