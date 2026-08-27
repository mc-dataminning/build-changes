import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egg {
   private static final Codec<egf> d = jd.K.q().dispatch(egf::a, ege::a);
   public static final Codec<egf> a = arh.a(
      (Supplier<Codec<egf>>)(() -> Codec.either(egd.c, d)
            .xmap($$0 -> (egf)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egd $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ege b = a("storage", egh.a);
   public static final ege c = a("context", egd.b);

   private static ege a(String $$0, Codec<? extends egf> $$1) {
      return ht.a(jd.K, new aey($$0), new ege($$1));
   }
}
