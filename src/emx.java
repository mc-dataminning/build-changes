import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class emx {
   private static final Codec<emw> f = kf.I.q().dispatch(emw::b, emv::a);
   public static final Codec<emw> a = avq.a(
      (Supplier<Codec<emw>>)(() -> {
         Codec<emw> $$0 = avq.e(f, emz.a);
         return Codec.either(emu.b, $$0)
            .xmap($$0x -> (emw)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof emu $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final emv b = a("constant", emu.a);
   public static final emv c = a("uniform", emz.a);
   public static final emv d = a("binomial", emt.a);
   public static final emv e = a("score", emy.a);

   private static emv a(String $$0, Codec<? extends emw> $$1) {
      return iv.a(kf.I, new aiy($$0), new emv($$1));
   }
}
