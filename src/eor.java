import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eor {
   private static final Codec<eoq> f = ki.I.q().dispatch(eoq::b, eop::a);
   public static final Codec<eoq> a = awe.a(
      (Supplier<Codec<eoq>>)(() -> {
         Codec<eoq> $$0 = awe.e(f, eot.a);
         return Codec.either(eoo.b, $$0)
            .xmap($$0x -> (eoq)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eoo $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eop b = a("constant", eoo.a);
   public static final eop c = a("uniform", eot.a);
   public static final eop d = a("binomial", eon.a);
   public static final eop e = a("score", eos.a);

   private static eop a(String $$0, Codec<? extends eoq> $$1) {
      return iy.a(ki.I, new ajh($$0), new eop($$1));
   }
}
