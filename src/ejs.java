import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ejs {
   private static final Codec<ejr> d = kb.J.q().dispatch(ejr::a, ejq::a);
   public static final Codec<ejr> a = atg.a(
      (Supplier<Codec<ejr>>)(() -> Codec.either(ejp.c, d)
            .xmap($$0 -> (ejr)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ejp $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ejq b = a("storage", ejt.a);
   public static final ejq c = a("context", ejp.b);

   private static ejq a(String $$0, Codec<? extends ejr> $$1) {
      return ir.a(kb.J, new agt($$0), new ejq($$1));
   }
}
