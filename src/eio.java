import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eio {
   private static final Codec<ein> d = jy.L.q().dispatch(ein::a, eim::a);
   public static final Codec<ein> a = asq.a(
      (Supplier<Codec<ein>>)(() -> Codec.either(eik.b, d)
            .xmap($$0 -> (ein)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eik $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eim b = a("fixed", eil.a);
   public static final eim c = a("context", eik.a);

   private static eim a(String $$0, Codec<? extends ein> $$1) {
      return io.a(jy.L, new agg($$0), new eim($$1));
   }
}
