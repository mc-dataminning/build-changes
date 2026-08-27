import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ewa {
   private static final Codec<evz> d = lh.K.q().dispatch(evz::a, evy::a);
   public static final Codec<evz> a = axu.a(
      (Supplier<Codec<evz>>)(() -> Codec.either(evw.b, d)
            .xmap($$0 -> (evz)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof evw $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final evy b = a("fixed", evx.a);
   public static final evy c = a("context", evw.a);

   private static evy a(String $$0, Codec<? extends evz> $$1) {
      return jn.a(lh.K, new akt($$0), new evy($$1));
   }
}
