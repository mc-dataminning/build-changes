import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fag {
   private static final Codec<faf> d = ma.H.q().dispatch(faf::a, fae::a);
   public static final Codec<faf> a = Codec.lazyInitialized(
      () -> Codec.either(fad.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fad $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fae b = a("storage", fah.a);
   public static final fae c = a("context", fad.b);

   private static fae a(String $$0, MapCodec<? extends faf> $$1) {
      return kd.a(ma.H, alp.b($$0), new fae($$1));
   }
}
