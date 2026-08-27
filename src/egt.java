import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egt {
   private static final Codec<egs> d = jb.L.q().dispatch(egs::a, egr::a);
   public static final Codec<egs> a = arf.a(
      (Supplier<Codec<egs>>)(() -> Codec.either(egp.b, d)
            .xmap($$0 -> (egs)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egp $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egr b = a("fixed", egq.a);
   public static final egr c = a("context", egp.a);

   private static egr a(String $$0, Codec<? extends egs> $$1) {
      return hq.a(jb.L, new aew($$0), new egr($$1));
   }
}
