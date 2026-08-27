import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egj {
   private static final Codec<egi> d = jb.L.q().dispatch(egi::a, egh::a);
   public static final Codec<egi> a = aqy.a(
      (Supplier<Codec<egi>>)(() -> Codec.either(egf.b, d)
            .xmap($$0 -> (egi)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egf $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egh b = a("fixed", egg.a);
   public static final egh c = a("context", egf.a);

   private static egh a(String $$0, Codec<? extends egi> $$1) {
      return hr.a(jb.L, new aer($$0), new egh($$1));
   }
}
