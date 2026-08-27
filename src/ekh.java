import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekh {
   private static final Codec<ekg> d = kb.K.q().dispatch(ekg::a, ekf::a);
   public static final Codec<ekg> a = atg.a(
      (Supplier<Codec<ekg>>)(() -> Codec.either(ekd.b, d)
            .xmap($$0 -> (ekg)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof ekd $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final ekf b = a("fixed", eke.a);
   public static final ekf c = a("context", ekd.a);

   private static ekf a(String $$0, Codec<? extends ekg> $$1) {
      return ir.a(kb.K, new agt($$0), new ekf($$1));
   }
}
