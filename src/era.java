import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class era {
   private static final Codec<eqz> d = kt.J.q().dispatch(eqz::a, eqy::a);
   public static final Codec<eqz> a = awu.a(
      (Supplier<Codec<eqz>>)(() -> Codec.either(eqx.c, d)
            .xmap($$0 -> (eqz)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eqx $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eqy b = a("storage", erb.a);
   public static final eqy c = a("context", eqx.b);

   private static eqy a(String $$0, Codec<? extends eqz> $$1) {
      return ja.a(kt.J, new ajv($$0), new eqy($$1));
   }
}
