import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fah {
   private static final Codec<fag> d = mb.I.q().dispatch(fag::a, faf::a);
   public static final Codec<fag> a = Codec.lazyInitialized(
      () -> Codec.either(fad.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fad $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final faf b = a("fixed", fae.a);
   public static final faf c = a("context", fad.a);

   private static faf a(String $$0, MapCodec<? extends fag> $$1) {
      return ke.a(mb.I, akv.b($$0), new faf($$1));
   }
}
