import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekq {
   private static final Codec<ekp> f = kd.I.q().dispatch(ekp::b, eko::a);
   public static final Codec<ekp> a = atv.a(
      (Supplier<Codec<ekp>>)(() -> {
         Codec<ekp> $$0 = atv.e(f, eks.a);
         return Codec.either(ekn.b, $$0)
            .xmap($$0x -> (ekp)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof ekn $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eko b = a("constant", ekn.a);
   public static final eko c = a("uniform", eks.a);
   public static final eko d = a("binomial", ekm.a);
   public static final eko e = a("score", ekr.a);

   private static eko a(String $$0, Codec<? extends ekp> $$1) {
      return it.a(kd.I, new ahg($$0), new eko($$1));
   }
}
