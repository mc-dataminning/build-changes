import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eqy {
   private static final Codec<eqx> f = kr.I.q().dispatch(eqx::b, eqw::a);
   public static final Codec<eqx> a = aws.a(
      (Supplier<Codec<eqx>>)(() -> {
         Codec<eqx> $$0 = aws.e(f, era.a);
         return Codec.either(eqv.b, $$0)
            .xmap($$0x -> (eqx)$$0x.map(Function.identity(), Function.identity()), $$0x -> $$0x instanceof eqv $$1 ? Either.left($$1) : Either.right($$0x));
      })
   );
   public static final eqw b = a("constant", eqv.a);
   public static final eqw c = a("uniform", era.a);
   public static final eqw d = a("binomial", equ.a);
   public static final eqw e = a("score", eqz.a);

   private static eqw a(String $$0, Codec<? extends eqx> $$1) {
      return iy.a(kr.I, new ajt($$0), new eqw($$1));
   }
}
