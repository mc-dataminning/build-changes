import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eux {
   private static final Codec<euw> d = lp.K.q().dispatch(euw::a, euv::a);
   public static final Codec<euw> a = Codec.lazyInitialized(
      () -> Codec.either(eut.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eut $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final euv b = a("fixed", euu.a);
   public static final euv c = a("context", eut.a);

   private static euv a(String $$0, MapCodec<? extends euw> $$1) {
      return jv.a(lp.K, new alf($$0), new euv($$1));
   }
}
