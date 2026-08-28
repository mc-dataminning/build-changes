import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyn {
   private static final Codec<eym> d = lx.I.q().dispatch(eym::a, eyl::a);
   public static final Codec<eym> a = Codec.lazyInitialized(
      () -> Codec.either(eyj.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eyj $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eyl b = a("fixed", eyk.a);
   public static final eyl c = a("context", eyj.a);

   private static eyl a(String $$0, MapCodec<? extends eym> $$1) {
      return kc.a(lx.I, alh.b($$0), new eyl($$1));
   }
}
