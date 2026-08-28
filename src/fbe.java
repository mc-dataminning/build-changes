import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fbe {
   private static final Codec<fbd> d = ma.I.q().dispatch(fbd::a, fbc::a);
   public static final Codec<fbd> a = Codec.lazyInitialized(
      () -> Codec.either(fba.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fba $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fbc b = a("fixed", fbb.a);
   public static final fbc c = a("context", fba.a);

   private static fbc a(String $$0, MapCodec<? extends fbd> $$1) {
      return kd.a(ma.I, alz.b($$0), new fbc($$1));
   }
}
