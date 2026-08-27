import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egl {
   private static final Codec<egk> f = jd.J.q().dispatch(egk::b, egj::a);
   public static final Codec<egk> a = arg.a(
      (Supplier<Codec<egk>>)(() -> {
         Codec<egk> $$0 = arg.e(f, egn.a);
         return Codec.either(egi.b, $$0)
            .xmap($$0x -> (egk)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof egi $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final egj b = a("constant", egi.a);
   public static final egj c = a("uniform", egn.a);
   public static final egj d = a("binomial", egh.a);
   public static final egj e = a("score", egm.a);

   private static egj a(String $$0, Codec<? extends egk> $$1) {
      return ht.a(jd.J, new aex($$0), new egj($$1));
   }
}
