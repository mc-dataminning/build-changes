import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eui {
   private static final Codec<euh> d = lp.J.q().dispatch(euh::a, eug::a);
   public static final Codec<euh> a = Codec.lazyInitialized(
      () -> Codec.either(euf.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof euf $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eug b = a("storage", euj.a);
   public static final eug c = a("context", euf.b);

   private static eug a(String $$0, MapCodec<? extends euh> $$1) {
      return jv.a(lp.J, new alf($$0), new eug($$1));
   }
}
