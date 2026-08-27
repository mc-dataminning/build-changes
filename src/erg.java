import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class erg {
   private static final Codec<erf> d = kr.K.q().dispatch(erf::a, ere::a);
   public static final Codec<erf> a = aws.a(
      (Supplier<Codec<erf>>)(() -> Codec.either(erc.b, d)
            .xmap($$0 -> (erf)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof erc $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ere b = a("fixed", erd.a);
   public static final ere c = a("context", erc.a);

   private static ere a(String $$0, Codec<? extends erf> $$1) {
      return iy.a(kr.K, new ajt($$0), new ere($$1));
   }
}
