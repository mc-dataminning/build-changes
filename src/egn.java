import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egn {
   private static final Codec<egm> f = jd.J.q().dispatch(egm::b, egl::a);
   public static final Codec<egm> a = arh.a(
      (Supplier<Codec<egm>>)(() -> {
         Codec<egm> $$0 = arh.e(f, egp.a);
         return Codec.either(egk.b, $$0)
            .xmap($$0x -> (egm)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof egk $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final egl b = a("constant", egk.a);
   public static final egl c = a("uniform", egp.a);
   public static final egl d = a("binomial", egj.a);
   public static final egl e = a("score", ego.a);

   private static egl a(String $$0, Codec<? extends egm> $$1) {
      return ht.a(jd.J, new aey($$0), new egl($$1));
   }
}
