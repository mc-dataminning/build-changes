import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eig {
   private static final Codec<eif> f = jy.J.q().dispatch(eif::b, eie::a);
   public static final Codec<eif> a = asq.a(
      (Supplier<Codec<eif>>)(() -> {
         Codec<eif> $$0 = asq.e(f, eii.a);
         return Codec.either(eid.b, $$0)
            .xmap($$0x -> (eif)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eid $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eie b = a("constant", eid.a);
   public static final eie c = a("uniform", eii.a);
   public static final eie d = a("binomial", eic.a);
   public static final eie e = a("score", eih.a);

   private static eie a(String $$0, Codec<? extends eif> $$1) {
      return io.a(jy.J, new agg($$0), new eie($$1));
   }
}
