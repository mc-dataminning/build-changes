import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eky {
   private static final Codec<ekx> d = kd.K.q().dispatch(ekx::a, ekw::a);
   public static final Codec<ekx> a = atv.a(
      (Supplier<Codec<ekx>>)(() -> Codec.either(eku.b, d)
            .xmap($$0 -> (ekx)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eku $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ekw b = a("fixed", ekv.a);
   public static final ekw c = a("context", eku.a);

   private static ekw a(String $$0, Codec<? extends ekx> $$1) {
      return it.a(kd.K, new ahg($$0), new ekw($$1));
   }
}
