import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class esm {
   private static final Codec<esl> g = ld.I.q().dispatch(esl::b, esk::a);
   public static final Codec<esl> a = axh.a(
      (Supplier<Codec<esl>>)(() -> {
         Codec<esl> $$0 = axh.e(g, esp.a);
         return Codec.either(esj.b, $$0)
            .xmap($$0x -> (esl)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof esj $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final esk b = a("constant", esj.a);
   public static final esk c = a("uniform", esp.a);
   public static final esk d = a("binomial", esi.a);
   public static final esk e = a("score", esn.a);
   public static final esk f = a("storage", eso.a);

   private static esk a(String $$0, Codec<? extends esl> $$1) {
      return jj.a(ld.I, new akh($$0), new esk($$1));
   }
}
