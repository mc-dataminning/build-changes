import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class emy {
   private static final Codec<emx> d = kf.K.q().dispatch(emx::a, emw::a);
   public static final Codec<emx> a = avp.a(
      (Supplier<Codec<emx>>)(() -> Codec.either(emu.b, d)
            .xmap($$0 -> (emx)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof emu $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final emw b = a("fixed", emv.a);
   public static final emw c = a("context", emu.a);

   private static emw a(String $$0, Codec<? extends emx> $$1) {
      return iv.a(kf.K, new aiy($$0), new emw($$1));
   }
}
