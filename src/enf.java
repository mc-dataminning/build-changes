import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class enf {
   private static final Codec<ene> d = kf.K.q().dispatch(ene::a, end::a);
   public static final Codec<ene> a = avq.a(
      (Supplier<Codec<ene>>)(() -> Codec.either(enb.b, d)
            .xmap($$0 -> (ene)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof enb $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final end b = a("fixed", enc.a);
   public static final end c = a("context", enb.a);

   private static end a(String $$0, Codec<? extends ene> $$1) {
      return iv.a(kf.K, new aiy($$0), new end($$1));
   }
}
