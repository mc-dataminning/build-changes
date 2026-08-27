import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class efv {
   private static final Codec<efu> d = jb.K.q().dispatch(efu::a, eft::a);
   public static final Codec<efu> a = aqy.a(
      (Supplier<Codec<efu>>)(() -> Codec.either(efs.c, d)
            .xmap($$0 -> (efu)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof efs $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eft b = a("storage", efw.a);
   public static final eft c = a("context", efs.b);

   private static eft a(String $$0, Codec<? extends efu> $$1) {
      return hr.a(jb.K, new aer($$0), new eft($$1));
   }
}
