import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euj {
   private static final Codec<eui> d = lp.J.q().dispatch(eui::a, euh::a);
   public static final Codec<eui> a = Codec.lazyInitialized(
      () -> Codec.either(eug.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eug $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final euh b = a("storage", euk.a);
   public static final euh c = a("context", eug.b);

   private static euh a(String $$0, MapCodec<? extends eui> $$1) {
      return jv.a(lp.J, new alf($$0), new euh($$1));
   }
}
