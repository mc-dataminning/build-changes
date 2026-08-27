import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eil {
   private static final Codec<eik> d = jy.K.q().dispatch(eik::a, eij::a);
   public static final Codec<eik> a = asu.a(
      (Supplier<Codec<eik>>)(() -> Codec.either(eii.c, d)
            .xmap($$0 -> (eik)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eii $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eij b = a("storage", eim.a);
   public static final eij c = a("context", eii.b);

   private static eij a(String $$0, Codec<? extends eik> $$1) {
      return io.a(jy.K, new agi($$0), new eij($$1));
   }
}
