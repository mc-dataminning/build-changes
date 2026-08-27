import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eis {
   private static final Codec<eir> f = jy.J.q().dispatch(eir::b, eiq::a);
   public static final Codec<eir> a = asu.a(
      (Supplier<Codec<eir>>)(() -> {
         Codec<eir> $$0 = asu.e(f, eiu.a);
         return Codec.either(eip.b, $$0)
            .xmap($$0x -> (eir)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eip $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eiq b = a("constant", eip.a);
   public static final eiq c = a("uniform", eiu.a);
   public static final eiq d = a("binomial", eio.a);
   public static final eiq e = a("score", eit.a);

   private static eiq a(String $$0, Codec<? extends eir> $$1) {
      return io.a(jy.J, new agi($$0), new eiq($$1));
   }
}
