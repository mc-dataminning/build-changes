import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eop {
   private static final Codec<eoo> f = ki.I.q().dispatch(eoo::b, eon::a);
   public static final Codec<eoo> a = awe.a(
      (Supplier<Codec<eoo>>)(() -> {
         Codec<eoo> $$0 = awe.e(f, eor.a);
         return Codec.either(eom.b, $$0)
            .xmap($$0x -> (eoo)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eom $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eon b = a("constant", eom.a);
   public static final eon c = a("uniform", eor.a);
   public static final eon d = a("binomial", eol.a);
   public static final eon e = a("score", eoq.a);

   private static eon a(String $$0, Codec<? extends eoo> $$1) {
      return iy.a(ki.I, new ajh($$0), new eon($$1));
   }
}
