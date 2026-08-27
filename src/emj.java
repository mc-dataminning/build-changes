import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class emj {
   private static final Codec<emi> d = kf.J.q().dispatch(emi::a, emh::a);
   public static final Codec<emi> a = avp.a(
      (Supplier<Codec<emi>>)(() -> Codec.either(emg.c, d)
            .xmap($$0 -> (emi)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof emg $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final emh b = a("storage", emk.a);
   public static final emh c = a("context", emg.b);

   private static emh a(String $$0, Codec<? extends emi> $$1) {
      return iv.a(kf.J, new aiy($$0), new emh($$1));
   }
}
