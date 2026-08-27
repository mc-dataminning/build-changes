import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class evr {
   private static final Codec<evq> g = lh.I.q().dispatch(evq::b, evp::a);
   public static final Codec<evq> a = axu.a(
      (Supplier<Codec<evq>>)(() -> {
         Codec<evq> $$0 = axu.e(g, evu.a);
         return Codec.either(evo.b, $$0)
            .xmap($$0x -> (evq)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof evo $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final evp b = a("constant", evo.a);
   public static final evp c = a("uniform", evu.a);
   public static final evp d = a("binomial", evn.a);
   public static final evp e = a("score", evs.a);
   public static final evp f = a("storage", evt.a);

   private static evp a(String $$0, Codec<? extends evq> $$1) {
      return jn.a(lh.I, new akt($$0), new evp($$1));
   }
}
