import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ets {
   private static final Codec<etr> d = le.K.q().dispatch(etr::a, etq::a);
   public static final Codec<etr> a = Codec.lazyInitialized(
      () -> Codec.either(eto.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eto $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final etq b = a("fixed", etp.a);
   public static final etq c = a("context", eto.a);

   private static etq a(String $$0, MapCodec<? extends etr> $$1) {
      return jk.a(le.K, new akn($$0), new etq($$1));
   }
}
