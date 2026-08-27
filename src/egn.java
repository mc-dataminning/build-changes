import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egn {
   private static final Codec<egm> d = jb.L.q().dispatch(egm::a, egl::a);
   public static final Codec<egm> a = arj.a(
      (Supplier<Codec<egm>>)(() -> Codec.either(egj.b, d)
            .xmap($$0 -> (egm)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egj $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egl b = a("fixed", egk.a);
   public static final egl c = a("context", egj.a);

   private static egl a(String $$0, Codec<? extends egm> $$1) {
      return hq.a(jb.L, new aez($$0), new egl($$1));
   }
}
