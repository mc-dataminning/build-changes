import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class erh {
   private static final Codec<erg> f = kt.I.q().dispatch(erg::b, erf::a);
   public static final Codec<erg> a = awu.a(
      (Supplier<Codec<erg>>)(() -> {
         Codec<erg> $$0 = awu.e(f, erj.a);
         return Codec.either(ere.b, $$0)
            .xmap($$0x -> (erg)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof ere $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final erf b = a("constant", ere.a);
   public static final erf c = a("uniform", erj.a);
   public static final erf d = a("binomial", erd.a);
   public static final erf e = a("score", eri.a);

   private static erf a(String $$0, Codec<? extends erg> $$1) {
      return ja.a(kt.I, new ajv($$0), new erf($$1));
   }
}
