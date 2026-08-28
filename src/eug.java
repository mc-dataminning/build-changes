import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eug {
   private static final Codec<euf> d = lp.J.q().dispatch(euf::a, eue::a);
   public static final Codec<euf> a = Codec.lazyInitialized(
      () -> Codec.either(eud.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eud $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eue b = a("storage", euh.a);
   public static final eue c = a("context", eud.b);

   private static eue a(String $$0, MapCodec<? extends euf> $$1) {
      return jv.a(lp.J, new ale($$0), new eue($$1));
   }
}
