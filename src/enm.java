import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class enm {
   private static final Codec<enl> d = kh.J.q().dispatch(enl::a, enk::a);
   public static final Codec<enl> a = avu.a(
      (Supplier<Codec<enl>>)(() -> Codec.either(enj.c, d)
            .xmap($$0 -> (enl)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof enj $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final enk b = a("storage", enn.a);
   public static final enk c = a("context", enj.b);

   private static enk a(String $$0, Codec<? extends enl> $$1) {
      return ix.a(kh.J, new ajc($$0), new enk($$1));
   }
}
