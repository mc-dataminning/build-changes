import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egb {
   private static final Codec<ega> f = jb.J.q().dispatch(ega::b, efz::a);
   public static final Codec<ega> a = aqy.a(
      (Supplier<Codec<ega>>)(() -> {
         Codec<ega> $$0 = aqy.c(f, egd.a);
         return Codec.either(efy.b, $$0)
            .xmap($$0x -> (ega)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof efy $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final efz b = a("constant", efy.a);
   public static final efz c = a("uniform", egd.a);
   public static final efz d = a("binomial", efx.a);
   public static final efz e = a("score", egc.a);

   private static efz a(String $$0, Codec<? extends ega> $$1) {
      return hr.a(jb.J, new aer($$0), new efz($$1));
   }
}
