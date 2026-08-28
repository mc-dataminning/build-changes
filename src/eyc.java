import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyc {
   private static final Codec<eyb> d = lv.I.q().dispatch(eyb::a, eya::a);
   public static final Codec<eyb> a = Codec.lazyInitialized(
      () -> Codec.either(exy.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof exy $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eya b = a("fixed", exz.a);
   public static final eya c = a("context", exy.a);

   private static eya a(String $$0, MapCodec<? extends eyb> $$1) {
      return kb.a(lv.I, ale.b($$0), new eya($$1));
   }
}
