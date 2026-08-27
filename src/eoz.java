import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eoz {
   private static final Codec<eoy> d = ki.K.q().dispatch(eoy::a, eox::a);
   public static final Codec<eoy> a = awe.a(
      (Supplier<Codec<eoy>>)(() -> Codec.either(eov.b, d)
            .xmap($$0 -> (eoy)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eov $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eox b = a("fixed", eow.a);
   public static final eox c = a("context", eov.a);

   private static eox a(String $$0, Codec<? extends eoy> $$1) {
      return iy.a(ki.K, new ajh($$0), new eox($$1));
   }
}
