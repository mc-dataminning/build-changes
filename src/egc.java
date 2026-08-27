import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egc {
   private static final Codec<egb> f = jb.J.q().dispatch(egb::b, ega::a);
   public static final Codec<egb> a = aqy.a(
      (Supplier<Codec<egb>>)(() -> {
         Codec<egb> $$0 = aqy.c(f, ege.a);
         return Codec.either(efz.b, $$0)
            .xmap($$0x -> (egb)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof efz $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final ega b = a("constant", efz.a);
   public static final ega c = a("uniform", ege.a);
   public static final ega d = a("binomial", efy.a);
   public static final ega e = a("score", egd.a);

   private static ega a(String $$0, Codec<? extends egb> $$1) {
      return hr.a(jb.J, new aer($$0), new ega($$1));
   }
}
