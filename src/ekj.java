import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekj {
   private static final Codec<eki> d = kd.J.q().dispatch(eki::a, ekh::a);
   public static final Codec<eki> a = atv.a(
      (Supplier<Codec<eki>>)(() -> Codec.either(ekg.c, d)
            .xmap($$0 -> (eki)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ekg $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ekh b = a("storage", ekk.a);
   public static final ekh c = a("context", ekg.b);

   private static ekh a(String $$0, Codec<? extends eki> $$1) {
      return it.a(kd.J, new ahg($$0), new ekh($$1));
   }
}
