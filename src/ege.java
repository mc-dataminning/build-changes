import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ege {
   private static final Codec<egd> d = jb.K.q().dispatch(egd::a, egc::a);
   public static final Codec<egd> a = arf.a(
      (Supplier<Codec<egd>>)(() -> Codec.either(egb.c, d)
            .xmap($$0 -> (egd)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egb $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egc b = a("storage", egf.a);
   public static final egc c = a("context", egb.b);

   private static egc a(String $$0, Codec<? extends egd> $$1) {
      return hq.a(jb.K, new aew($$0), new egc($$1));
   }
}
