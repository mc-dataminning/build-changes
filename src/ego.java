import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ego {
   private static final Codec<egn> d = jd.L.q().dispatch(egn::a, egm::a);
   public static final Codec<egn> a = arb.a(
      (Supplier<Codec<egn>>)(() -> Codec.either(egk.b, d)
            .xmap($$0 -> (egn)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egk $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egm b = a("fixed", egl.a);
   public static final egm c = a("context", egk.a);

   private static egm a(String $$0, Codec<? extends egn> $$1) {
      return ht.a(jd.L, new aeu($$0), new egm($$1));
   }
}
