import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fcx {
   private static final Codec<fcw> d = mf.H.q().dispatch(fcw::a, fcv::a);
   public static final Codec<fcw> a = Codec.lazyInitialized(
      () -> Codec.either(fcu.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fcu $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fcv b = a("storage", fcy.a);
   public static final fcv c = a("context", fcu.b);

   private static fcv a(String $$0, MapCodec<? extends fcw> $$1) {
      return jr.a(mf.H, alg.b($$0), new fcv($$1));
   }
}
