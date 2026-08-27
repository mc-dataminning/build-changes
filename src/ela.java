import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ela {
   private static final Codec<ekz> f = kd.I.q().dispatch(ekz::b, eky::a);
   public static final Codec<ekz> a = atx.a(
      (Supplier<Codec<ekz>>)(() -> {
         Codec<ekz> $$0 = atx.e(f, elc.a);
         return Codec.either(ekx.b, $$0)
            .xmap($$0x -> (ekz)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof ekx $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eky b = a("constant", ekx.a);
   public static final eky c = a("uniform", elc.a);
   public static final eky d = a("binomial", ekw.a);
   public static final eky e = a("score", elb.a);

   private static eky a(String $$0, Codec<? extends ekz> $$1) {
      return it.a(kd.I, new ahh($$0), new eky($$1));
   }
}
