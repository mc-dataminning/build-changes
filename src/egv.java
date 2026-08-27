import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egv {
   private static final Codec<egu> d = jd.L.q().dispatch(egu::a, egt::a);
   public static final Codec<egu> a = arh.a(
      (Supplier<Codec<egu>>)(() -> Codec.either(egr.b, d)
            .xmap($$0 -> (egu)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egr $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egt b = a("fixed", egs.a);
   public static final egt c = a("context", egr.a);

   private static egt a(String $$0, Codec<? extends egu> $$1) {
      return ht.a(jd.L, new aey($$0), new egt($$1));
   }
}
