import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class ehd {
   private static final Codec<ehc> f = jy.J.q().dispatch(ehc::b, ehb::a);
   public static final Codec<ehc> a = asg.a(
      (Supplier<Codec<ehc>>)(() -> {
         Codec<ehc> $$0 = asg.e(f, ehf.a);
         return Codec.either(eha.b, $$0)
            .xmap($$0x -> (ehc)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eha $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final ehb b = a("constant", eha.a);
   public static final ehb c = a("uniform", ehf.a);
   public static final ehb d = a("binomial", egz.a);
   public static final ehb e = a("score", ehe.a);

   private static ehb a(String $$0, Codec<? extends ehc> $$1) {
      return io.a(jy.J, new afw($$0), new ehb($$1));
   }
}
