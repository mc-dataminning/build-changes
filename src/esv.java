import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class esv {
   private static final Codec<esu> d = ld.K.q().dispatch(esu::a, est::a);
   public static final Codec<esu> a = axh.a(
      (Supplier<Codec<esu>>)(() -> Codec.either(esr.b, d)
            .xmap($$0 -> (esu)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof esr $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final est b = a("fixed", ess.a);
   public static final est c = a("context", esr.a);

   private static est a(String $$0, Codec<? extends esu> $$1) {
      return jj.a(ld.K, new akh($$0), new est($$1));
   }
}
