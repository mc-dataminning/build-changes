import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyn {
   private static final Codec<eym> d = lz.H.q().dispatch(eym::a, eyl::a);
   public static final Codec<eym> a = Codec.lazyInitialized(
      () -> Codec.either(eyk.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eyk $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eyl b = a("storage", eyo.a);
   public static final eyl c = a("context", eyk.b);

   private static eyl a(String $$0, MapCodec<? extends eym> $$1) {
      return kd.a(lz.H, alj.b($$0), new eyl($$1));
   }
}
