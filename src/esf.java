import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class esf {
   private static final Codec<ese> d = ld.J.q().dispatch(ese::a, esd::a);
   public static final Codec<ese> a = axh.a(
      (Supplier<Codec<ese>>)(() -> Codec.either(esc.c, d)
            .xmap($$0 -> (ese)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof esc $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final esd b = a("storage", esg.a);
   public static final esd c = a("context", esc.b);

   private static esd a(String $$0, Codec<? extends ese> $$1) {
      return jj.a(ld.J, new akh($$0), new esd($$1));
   }
}
