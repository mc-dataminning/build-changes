import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etq {
   private static final Codec<etp> d = le.K.q().dispatch(etp::a, eto::a);
   public static final Codec<etp> a = Codec.lazyInitialized(
      () -> Codec.either(etm.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof etm $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eto b = a("fixed", etn.a);
   public static final eto c = a("context", etm.a);

   private static eto a(String $$0, MapCodec<? extends etp> $$1) {
      return jk.a(le.K, new akm($$0), new eto($$1));
   }
}
