import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eok {
   private static final Codec<eoj> d = ki.J.q().dispatch(eoj::a, eoi::a);
   public static final Codec<eoj> a = awe.a(
      (Supplier<Codec<eoj>>)(() -> Codec.either(eoh.c, d)
            .xmap($$0 -> (eoj)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eoh $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eoi b = a("storage", eol.a);
   public static final eoi c = a("context", eoh.b);

   private static eoi a(String $$0, Codec<? extends eoj> $$1) {
      return iy.a(ki.J, new ajh($$0), new eoi($$1));
   }
}
