import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eks {
   private static final Codec<ekr> d = kd.K.q().dispatch(ekr::a, ekq::a);
   public static final Codec<ekr> a = atq.a(
      (Supplier<Codec<ekr>>)(() -> Codec.either(eko.b, d)
            .xmap($$0 -> (ekr)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eko $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ekq b = a("fixed", ekp.a);
   public static final ekq c = a("context", eko.a);

   private static ekq a(String $$0, Codec<? extends ekr> $$1) {
      return it.a(kd.K, new ahd($$0), new ekq($$1));
   }
}
