import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euh {
   private static final Codec<eug> d = lp.J.q().dispatch(eug::a, euf::a);
   public static final Codec<eug> a = Codec.lazyInitialized(
      () -> Codec.either(eue.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eue $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final euf b = a("storage", eui.a);
   public static final euf c = a("context", eue.b);

   private static euf a(String $$0, MapCodec<? extends eug> $$1) {
      return jv.a(lp.J, new alf($$0), new euf($$1));
   }
}
