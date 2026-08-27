import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eja {
   private static final Codec<eiz> d = jy.L.q().dispatch(eiz::a, eiy::a);
   public static final Codec<eiz> a = asu.a(
      (Supplier<Codec<eiz>>)(() -> Codec.either(eiw.b, d)
            .xmap($$0 -> (eiz)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eiw $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eiy b = a("fixed", eix.a);
   public static final eiy c = a("context", eiw.a);

   private static eiy a(String $$0, Codec<? extends eiz> $$1) {
      return io.a(jy.L, new agi($$0), new eiy($$1));
   }
}
