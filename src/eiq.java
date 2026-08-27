import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eiq {
   private static final Codec<eip> d = kc.K.q().dispatch(eip::a, eio::a);
   public static final Codec<eip> a = asy.a(
      (Supplier<Codec<eip>>)(() -> Codec.either(ein.c, d)
            .xmap($$0 -> (eip)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ein $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eio b = a("storage", eir.a);
   public static final eio c = a("context", ein.b);

   private static eio a(String $$0, Codec<? extends eip> $$1) {
      return is.a(kc.K, new agm($$0), new eio($$1));
   }
}
