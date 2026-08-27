import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eoi {
   private static final Codec<eoh> d = ki.J.q().dispatch(eoh::a, eog::a);
   public static final Codec<eoh> a = awe.a(
      (Supplier<Codec<eoh>>)(() -> Codec.either(eof.c, d)
            .xmap($$0 -> (eoh)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eof $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eog b = a("storage", eoj.a);
   public static final eog c = a("context", eof.b);

   private static eog a(String $$0, Codec<? extends eoh> $$1) {
      return iy.a(ki.J, new ajh($$0), new eog($$1));
   }
}
