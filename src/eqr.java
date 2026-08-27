import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public class eqr {
   private static final Codec<eqq> d = kr.J.q().dispatch(eqq::a, eqp::a);
   public static final Codec<eqq> a = aws.a(
      (Supplier<Codec<eqq>>)(() -> Codec.either(eqo.c, d)
            .xmap($$0 -> (eqq)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0 instanceof eqo $$1 ? Either.left($$1) : Either.right($$0)))
   );
   public static final eqp b = a("storage", eqs.a);
   public static final eqp c = a("context", eqo.b);

   private static eqp a(String $$0, Codec<? extends eqq> $$1) {
      return iy.a(kr.J, new ajt($$0), new eqp($$1));
   }
}
