import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fag {
   private static final Codec<faf> d = mb.I.q().dispatch(faf::a, fae::a);
   public static final Codec<faf> a = Codec.lazyInitialized(
      () -> Codec.either(fac.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fac $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fae b = a("fixed", fad.a);
   public static final fae c = a("context", fac.a);

   private static fae a(String $$0, MapCodec<? extends faf> $$1) {
      return ke.a(mb.I, aku.b($$0), new fae($$1));
   }
}
