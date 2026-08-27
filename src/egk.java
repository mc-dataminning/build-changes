import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egk {
   private static final Codec<egj> d = jb.L.q().dispatch(egj::a, egi::a);
   public static final Codec<egj> a = aqy.a(
      (Supplier<Codec<egj>>)(() -> Codec.either(egg.b, d)
            .xmap($$0 -> (egj)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egg $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egi b = a("fixed", egh.a);
   public static final egi c = a("context", egg.a);

   private static egi a(String $$0, Codec<? extends egj> $$1) {
      return hr.a(jb.L, new aer($$0), new egi($$1));
   }
}
