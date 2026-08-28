import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fer {
   private static final Codec<feq> d = mh.H.q().dispatch(feq::a, fep::a);
   public static final Codec<feq> a = Codec.lazyInitialized(
      () -> Codec.either(feo.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof feo $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fep b = a("storage", fes.a);
   public static final fep c = a("context", feo.b);

   private static fep a(String $$0, MapCodec<? extends feq> $$1) {
      return jt.a(mh.H, alr.b($$0), new fep($$1));
   }
}
