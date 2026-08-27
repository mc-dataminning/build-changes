import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ekr {
   private static final Codec<ekq> f = kd.I.q().dispatch(ekq::b, ekp::a);
   public static final Codec<ekq> a = atw.a(
      (Supplier<Codec<ekq>>)(() -> {
         Codec<ekq> $$0 = atw.e(f, ekt.a);
         return Codec.either(eko.b, $$0)
            .xmap($$0x -> (ekq)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eko $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final ekp b = a("constant", eko.a);
   public static final ekp c = a("uniform", ekt.a);
   public static final ekp d = a("binomial", ekn.a);
   public static final ekp e = a("score", eks.a);

   private static ekp a(String $$0, Codec<? extends ekq> $$1) {
      return it.a(kd.I, new ahg($$0), new ekp($$1));
   }
}
