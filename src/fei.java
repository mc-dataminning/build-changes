import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fei {
   private static final Codec<feh> d = mg.I.q().dispatch(feh::a, feg::a);
   public static final Codec<feh> a = Codec.lazyInitialized(
      () -> Codec.either(fee.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fee $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final feg b = a("fixed", fef.a);
   public static final feg c = a("context", fee.a);

   private static feg a(String $$0, MapCodec<? extends feh> $$1) {
      return js.a(mg.I, alg.b($$0), new feg($$1));
   }
}
