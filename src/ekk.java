import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekk {
   private static final Codec<ekj> d = kd.J.q().dispatch(ekj::a, eki::a);
   public static final Codec<ekj> a = atw.a(
      (Supplier<Codec<ekj>>)(() -> Codec.either(ekh.c, d)
            .xmap($$0 -> (ekj)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ekh $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eki b = a("storage", ekl.a);
   public static final eki c = a("context", ekh.b);

   private static eki a(String $$0, Codec<? extends ekj> $$1) {
      return it.a(kd.J, new ahg($$0), new eki($$1));
   }
}
