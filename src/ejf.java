import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ejf {
   private static final Codec<eje> d = kc.L.q().dispatch(eje::a, ejd::a);
   public static final Codec<eje> a = asy.a(
      (Supplier<Codec<eje>>)(() -> Codec.either(ejb.b, d)
            .xmap($$0 -> (eje)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ejb $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ejd b = a("fixed", ejc.a);
   public static final ejd c = a("context", ejb.a);

   private static ejd a(String $$0, Codec<? extends eje> $$1) {
      return is.a(kc.L, new agm($$0), new ejd($$1));
   }
}
