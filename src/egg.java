import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egg {
   private static final Codec<egf> f = jd.J.q().dispatch(egf::b, ege::a);
   public static final Codec<egf> a = arb.a(
      (Supplier<Codec<egf>>)(() -> {
         Codec<egf> $$0 = arb.e(f, egi.a);
         return Codec.either(egd.b, $$0)
            .xmap($$0x -> (egf)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof egd $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final ege b = a("constant", egd.a);
   public static final ege c = a("uniform", egi.a);
   public static final ege d = a("binomial", egc.a);
   public static final ege e = a("score", egh.a);

   private static ege a(String $$0, Codec<? extends egf> $$1) {
      return ht.a(jd.J, new aeu($$0), new ege($$1));
   }
}
