import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class erw {
   private static final Codec<erv> d = lc.J.q().dispatch(erv::a, eru::a);
   public static final Codec<erv> a = axe.a(
      (Supplier<Codec<erv>>)(() -> Codec.either(ert.c, d)
            .xmap($$0 -> (erv)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ert $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eru b = a("storage", erx.a);
   public static final eru c = a("context", ert.b);

   private static eru a(String $$0, Codec<? extends erv> $$1) {
      return ji.a(lc.J, new akf($$0), new eru($$1));
   }
}
