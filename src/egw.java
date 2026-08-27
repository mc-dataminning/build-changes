import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class egw {
   private static final Codec<egv> d = jy.K.q().dispatch(egv::a, egu::a);
   public static final Codec<egv> a = asg.a(
      (Supplier<Codec<egv>>)(() -> Codec.either(egt.c, d)
            .xmap($$0 -> (egv)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof egt $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final egu b = a("storage", egx.a);
   public static final egu c = a("context", egt.b);

   private static egu a(String $$0, Codec<? extends egv> $$1) {
      return io.a(jy.K, new afw($$0), new egu($$1));
   }
}
