import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euv {
   private static final Codec<euu> d = lp.K.q().dispatch(euu::a, eut::a);
   public static final Codec<euu> a = Codec.lazyInitialized(
      () -> Codec.either(eur.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eur $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eut b = a("fixed", eus.a);
   public static final eut c = a("context", eur.a);

   private static eut a(String $$0, MapCodec<? extends euu> $$1) {
      return jv.a(lp.K, new ale($$0), new eut($$1));
   }
}
