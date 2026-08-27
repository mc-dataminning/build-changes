import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class evk {
   private static final Codec<evj> d = lh.J.q().dispatch(evj::a, evi::a);
   public static final Codec<evj> a = axu.a(
      (Supplier<Codec<evj>>)(() -> Codec.either(evh.c, d)
            .xmap($$0 -> (evj)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof evh $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final evi b = a("storage", evl.a);
   public static final evi c = a("context", evh.b);

   private static evi a(String $$0, Codec<? extends evj> $$1) {
      return jn.a(lh.J, new akt($$0), new evi($$1));
   }
}
