import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euy {
   private static final Codec<eux> d = lp.K.q().dispatch(eux::a, euw::a);
   public static final Codec<eux> a = Codec.lazyInitialized(
      () -> Codec.either(euu.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof euu $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final euw b = a("fixed", euv.a);
   public static final euw c = a("context", euu.a);

   private static euw a(String $$0, MapCodec<? extends eux> $$1) {
      return jv.a(lp.K, new alf($$0), new euw($$1));
   }
}
