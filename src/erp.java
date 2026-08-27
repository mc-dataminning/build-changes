import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class erp {
   private static final Codec<ero> d = kt.K.q().dispatch(ero::a, ern::a);
   public static final Codec<ero> a = awu.a(
      (Supplier<Codec<ero>>)(() -> Codec.either(erl.b, d)
            .xmap($$0 -> (ero)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof erl $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ern b = a("fixed", erm.a);
   public static final ern c = a("context", erl.a);

   private static ern a(String $$0, Codec<? extends ero> $$1) {
      return ja.a(kt.K, new ajv($$0), new ern($$1));
   }
}
