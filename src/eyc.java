import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyc {
   private static final Codec<eyb> d = ly.H.q().dispatch(eyb::a, eya::a);
   public static final Codec<eyb> a = Codec.lazyInitialized(
      () -> Codec.either(exz.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof exz $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eya b = a("storage", eyd.a);
   public static final eya c = a("context", exz.b);

   private static eya a(String $$0, MapCodec<? extends eyb> $$1) {
      return kd.a(ly.H, ali.b($$0), new eya($$1));
   }
}
