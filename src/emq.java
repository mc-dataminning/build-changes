import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class emq {
   private static final Codec<emp> f = kf.I.q().dispatch(emp::b, emo::a);
   public static final Codec<emp> a = avp.a(
      (Supplier<Codec<emp>>)(() -> {
         Codec<emp> $$0 = avp.e(f, ems.a);
         return Codec.either(emn.b, $$0)
            .xmap($$0x -> (emp)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof emn $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final emo b = a("constant", emn.a);
   public static final emo c = a("uniform", ems.a);
   public static final emo d = a("binomial", emm.a);
   public static final emo e = a("score", emr.a);

   private static emo a(String $$0, Codec<? extends emp> $$1) {
      return iv.a(kf.I, new aiy($$0), new emo($$1));
   }
}
