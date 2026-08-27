import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eob {
   private static final Codec<eoa> d = kh.K.q().dispatch(eoa::a, enz::a);
   public static final Codec<eoa> a = avu.a(
      (Supplier<Codec<eoa>>)(() -> Codec.either(enx.b, d)
            .xmap($$0 -> (eoa)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof enx $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final enz b = a("fixed", eny.a);
   public static final enz c = a("context", enx.a);

   private static enz a(String $$0, Codec<? extends eoa> $$1) {
      return ix.a(kh.K, new ajc($$0), new enz($$1));
   }
}
