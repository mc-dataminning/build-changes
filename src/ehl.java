import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ehl {
   private static final Codec<ehk> d = jy.L.q().dispatch(ehk::a, ehj::a);
   public static final Codec<ehk> a = asg.a(
      (Supplier<Codec<ehk>>)(() -> Codec.either(ehh.b, d)
            .xmap($$0 -> (ehk)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ehh $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ehj b = a("fixed", ehi.a);
   public static final ehj c = a("context", ehh.a);

   private static ehj a(String $$0, Codec<? extends ehk> $$1) {
      return io.a(jy.L, new afw($$0), new ehj($$1));
   }
}
