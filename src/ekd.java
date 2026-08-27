import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekd {
   private static final Codec<ekc> d = kd.J.q().dispatch(ekc::a, ekb::a);
   public static final Codec<ekc> a = atq.a(
      (Supplier<Codec<ekc>>)(() -> Codec.either(eka.c, d)
            .xmap($$0 -> (ekc)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eka $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ekb b = a("storage", eke.a);
   public static final ekb c = a("context", eka.b);

   private static ekb a(String $$0, Codec<? extends ekc> $$1) {
      return it.a(kd.J, new ahd($$0), new ekb($$1));
   }
}
