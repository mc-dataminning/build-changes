import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class efu {
   private static final Codec<eft> d = jb.K.q().dispatch(eft::a, efs::a);
   public static final Codec<eft> a = aqy.a(
      (Supplier<Codec<eft>>)(() -> Codec.either(efr.c, d)
            .xmap($$0 -> (eft)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof efr $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final efs b = a("storage", efv.a);
   public static final efs c = a("context", efr.b);

   private static efs a(String $$0, Codec<? extends eft> $$1) {
      return hr.a(jb.K, new aer($$0), new efs($$1));
   }
}
