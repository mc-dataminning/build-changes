import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class efz {
   private static final Codec<efy> d = jd.K.q().dispatch(efy::a, efx::a);
   public static final Codec<efy> a = arb.a(
      (Supplier<Codec<efy>>)(() -> Codec.either(efw.c, d)
            .xmap($$0 -> (efy)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof efw $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final efx b = a("storage", ega.a);
   public static final efx c = a("context", efw.b);

   private static efx a(String $$0, Codec<? extends efy> $$1) {
      return ht.a(jd.K, new aeu($$0), new efx($$1));
   }
}
