import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class esd {
   private static final Codec<esc> f = lc.I.q().dispatch(esc::b, esb::a);
   public static final Codec<esc> a = axe.a(
      (Supplier<Codec<esc>>)(() -> {
         Codec<esc> $$0 = axe.e(f, esf.a);
         return Codec.either(esa.b, $$0)
            .xmap($$0x -> (esc)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof esa $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final esb b = a("constant", esa.a);
   public static final esb c = a("uniform", esf.a);
   public static final esb d = a("binomial", erz.a);
   public static final esb e = a("score", ese.a);

   private static esb a(String $$0, Codec<? extends esc> $$1) {
      return ji.a(lc.I, new akf($$0), new esb($$1));
   }
}
