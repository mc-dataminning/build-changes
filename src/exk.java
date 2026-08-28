import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exk {
   private static final Codec<exj> d = lu.I.q().dispatch(exj::a, exi::a);
   public static final Codec<exj> a = Codec.lazyInitialized(
      () -> Codec.either(exg.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof exg $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final exi b = a("fixed", exh.a);
   public static final exi c = a("context", exg.a);

   private static exi a(String $$0, MapCodec<? extends exj> $$1) {
      return ka.a(lu.I, alb.b($$0), new exi($$1));
   }
}
