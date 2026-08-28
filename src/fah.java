import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fah {
   private static final Codec<fag> d = ma.H.q().dispatch(fag::a, faf::a);
   public static final Codec<fag> a = Codec.lazyInitialized(
      () -> Codec.either(fae.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fae $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final faf b = a("storage", fai.a);
   public static final faf c = a("context", fae.b);

   private static faf a(String $$0, MapCodec<? extends fag> $$1) {
      return kd.a(ma.H, alz.b($$0), new faf($$1));
   }
}
