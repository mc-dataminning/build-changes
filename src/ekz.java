import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekz {
   private static final Codec<eky> d = kd.K.q().dispatch(eky::a, ekx::a);
   public static final Codec<eky> a = atw.a(
      (Supplier<Codec<eky>>)(() -> Codec.either(ekv.b, d)
            .xmap($$0 -> (eky)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ekv $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ekx b = a("fixed", ekw.a);
   public static final ekx c = a("context", ekv.a);

   private static ekx a(String $$0, Codec<? extends eky> $$1) {
      return it.a(kd.K, new ahg($$0), new ekx($$1));
   }
}
