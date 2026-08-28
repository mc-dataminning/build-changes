import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euf {
   private static final Codec<eue> d = lp.J.q().dispatch(eue::a, eud::a);
   public static final Codec<eue> a = Codec.lazyInitialized(
      () -> Codec.either(euc.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof euc $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eud b = a("storage", eug.a);
   public static final eud c = a("context", euc.b);

   private static eud a(String $$0, MapCodec<? extends eue> $$1) {
      return jv.a(lp.J, new ale($$0), new eud($$1));
   }
}
