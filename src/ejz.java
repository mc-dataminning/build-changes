import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ejz {
   private static final Codec<ejy> f = kb.I.q().dispatch(ejy::b, ejx::a);
   public static final Codec<ejy> a = atg.a(
      (Supplier<Codec<ejy>>)(() -> {
         Codec<ejy> $$0 = atg.e(f, ekb.a);
         return Codec.either(ejw.b, $$0)
            .xmap($$0x -> (ejy)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof ejw $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final ejx b = a("constant", ejw.a);
   public static final ejx c = a("uniform", ekb.a);
   public static final ejx d = a("binomial", ejv.a);
   public static final ejx e = a("score", eka.a);

   private static ejx a(String $$0, Codec<? extends ejy> $$1) {
      return ir.a(kb.I, new agt($$0), new ejx($$1));
   }
}
