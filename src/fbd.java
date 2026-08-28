import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fbd {
   private static final Codec<fbc> d = mb.I.q().dispatch(fbc::a, fbb::a);
   public static final Codec<fbc> a = Codec.lazyInitialized(
      () -> Codec.either(faz.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof faz $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fbb b = a("fixed", fba.a);
   public static final fbb c = a("context", faz.a);

   private static fbb a(String $$0, MapCodec<? extends fbc> $$1) {
      return ke.a(mb.I, aku.b($$0), new fbb($$1));
   }
}
