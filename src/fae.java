import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fae {
   private static final Codec<fad> d = mb.I.q().dispatch(fad::a, fac::a);
   public static final Codec<fad> a = Codec.lazyInitialized(
      () -> Codec.either(faa.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof faa $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fac b = a("fixed", fab.a);
   public static final fac c = a("context", faa.a);

   private static fac a(String $$0, MapCodec<? extends fad> $$1) {
      return ke.a(mb.I, aku.b($$0), new fac($$1));
   }
}
