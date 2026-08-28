import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdf {
   private static final Codec<fde> d = mf.H.q().dispatch(fde::a, fdd::a);
   public static final Codec<fde> a = Codec.lazyInitialized(
      () -> Codec.either(fdc.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fdc $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fdd b = a("storage", fdg.a);
   public static final fdd c = a("context", fdc.b);

   private static fdd a(String $$0, MapCodec<? extends fde> $$1) {
      return jr.a(mf.H, alg.b($$0), new fdd($$1));
   }
}
