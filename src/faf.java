import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class faf {
   private static final Codec<fae> d = mb.I.q().dispatch(fae::a, fad::a);
   public static final Codec<fae> a = Codec.lazyInitialized(
      () -> Codec.either(fab.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fab $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fad b = a("fixed", fac.a);
   public static final fad c = a("context", fab.a);

   private static fad a(String $$0, MapCodec<? extends fae> $$1) {
      return ke.a(mb.I, akv.b($$0), new fad($$1));
   }
}
