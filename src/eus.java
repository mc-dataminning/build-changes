import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eus {
   private static final Codec<eur> d = lp.K.q().dispatch(eur::a, euq::a);
   public static final Codec<eur> a = Codec.lazyInitialized(
      () -> Codec.either(euo.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof euo $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final euq b = a("fixed", eup.a);
   public static final euq c = a("context", euo.a);

   private static euq a(String $$0, MapCodec<? extends eur> $$1) {
      return jv.a(lp.K, new alb($$0), new euq($$1));
   }
}
