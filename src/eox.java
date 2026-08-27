import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eox {
   private static final Codec<eow> d = ki.K.q().dispatch(eow::a, eov::a);
   public static final Codec<eow> a = awe.a(
      (Supplier<Codec<eow>>)(() -> Codec.either(eot.b, d)
            .xmap($$0 -> (eow)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eot $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eov b = a("fixed", eou.a);
   public static final eov c = a("context", eot.a);

   private static eov a(String $$0, Codec<? extends eow> $$1) {
      return iy.a(ki.K, new ajh($$0), new eov($$1));
   }
}
