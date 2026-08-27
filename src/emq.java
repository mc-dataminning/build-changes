import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class emq {
   private static final Codec<emp> d = kf.J.q().dispatch(emp::a, emo::a);
   public static final Codec<emp> a = avq.a(
      (Supplier<Codec<emp>>)(() -> Codec.either(emn.c, d)
            .xmap($$0 -> (emp)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof emn $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final emo b = a("storage", emr.a);
   public static final emo c = a("context", emn.b);

   private static emo a(String $$0, Codec<? extends emp> $$1) {
      return iv.a(kf.J, new aiy($$0), new emo($$1));
   }
}
