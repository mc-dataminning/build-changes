import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class esl {
   private static final Codec<esk> d = lc.K.q().dispatch(esk::a, esj::a);
   public static final Codec<esk> a = axe.a(
      (Supplier<Codec<esk>>)(() -> Codec.either(esh.b, d)
            .xmap($$0 -> (esk)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof esh $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final esj b = a("fixed", esi.a);
   public static final esj c = a("context", esh.a);

   private static esj a(String $$0, Codec<? extends esk> $$1) {
      return ji.a(lc.K, new akf($$0), new esj($$1));
   }
}
