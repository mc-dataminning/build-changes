import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekt {
   private static final Codec<eks> d = kd.J.q().dispatch(eks::a, ekr::a);
   public static final Codec<eks> a = atx.a(
      (Supplier<Codec<eks>>)(() -> Codec.either(ekq.c, d)
            .xmap($$0 -> (eks)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ekq $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ekr b = a("storage", eku.a);
   public static final ekr c = a("context", ekq.b);

   private static ekr a(String $$0, Codec<? extends eks> $$1) {
      return it.a(kd.J, new ahh($$0), new ekr($$1));
   }
}
