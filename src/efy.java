import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class efy {
   private static final Codec<efx> d = jb.K.q().dispatch(efx::a, efw::a);
   public static final Codec<efx> a = arj.a(
      (Supplier<Codec<efx>>)(() -> Codec.either(efv.c, d)
            .xmap($$0 -> (efx)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof efv $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final efw b = a("storage", efz.a);
   public static final efw c = a("context", efv.b);

   private static efw a(String $$0, Codec<? extends efx> $$1) {
      return hq.a(jb.K, new aez($$0), new efw($$1));
   }
}
