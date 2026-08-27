import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egf {
   private static final Codec<ege> f = jb.J.q().dispatch(ege::b, egd::a);
   public static final Codec<ege> a = arj.a(
      (Supplier<Codec<ege>>)(() -> {
         Codec<ege> $$0 = arj.e(f, egh.a);
         return Codec.either(egc.b, $$0)
            .xmap($$0x -> (ege)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof egc $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final egd b = a("constant", egc.a);
   public static final egd c = a("uniform", egh.a);
   public static final egd d = a("binomial", egb.a);
   public static final egd e = a("score", egg.a);

   private static egd a(String $$0, Codec<? extends ege> $$1) {
      return hq.a(jb.J, new aez($$0), new egd($$1));
   }
}
