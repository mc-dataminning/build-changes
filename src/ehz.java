import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ehz {
   private static final Codec<ehy> d = jy.K.q().dispatch(ehy::a, ehx::a);
   public static final Codec<ehy> a = asq.a(
      (Supplier<Codec<ehy>>)(() -> Codec.either(ehw.c, d)
            .xmap($$0 -> (ehy)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ehw $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ehx b = a("storage", eia.a);
   public static final ehx c = a("context", ehw.b);

   private static ehx a(String $$0, Codec<? extends ehy> $$1) {
      return io.a(jy.K, new agg($$0), new ehx($$1));
   }
}
