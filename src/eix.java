import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eix {
   private static final Codec<eiw> f = kc.J.q().dispatch(eiw::b, eiv::a);
   public static final Codec<eiw> a = asy.a(
      (Supplier<Codec<eiw>>)(() -> {
         Codec<eiw> $$0 = asy.e(f, eiz.a);
         return Codec.either(eiu.b, $$0)
            .xmap($$0x -> (eiw)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eiu $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eiv b = a("constant", eiu.a);
   public static final eiv c = a("uniform", eiz.a);
   public static final eiv d = a("binomial", eit.a);
   public static final eiv e = a("score", eiy.a);

   private static eiv a(String $$0, Codec<? extends eiw> $$1) {
      return is.a(kc.J, new agm($$0), new eiv($$1));
   }
}
