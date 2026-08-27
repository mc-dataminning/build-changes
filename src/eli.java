import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eli {
   private static final Codec<elh> d = kd.K.q().dispatch(elh::a, elg::a);
   public static final Codec<elh> a = atx.a(
      (Supplier<Codec<elh>>)(() -> Codec.either(ele.b, d)
            .xmap($$0 -> (elh)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ele $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final elg b = a("fixed", elf.a);
   public static final elg c = a("context", ele.a);

   private static elg a(String $$0, Codec<? extends elh> $$1) {
      return it.a(kd.K, new ahh($$0), new elg($$1));
   }
}
