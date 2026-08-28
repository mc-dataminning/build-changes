import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class feh {
   private static final Codec<feg> d = mh.H.q().dispatch(feg::a, fef::a);
   public static final Codec<feg> a = Codec.lazyInitialized(
      () -> Codec.either(fee.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fee $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fef b = a("storage", fei.a);
   public static final fef c = a("context", fee.b);

   private static fef a(String $$0, MapCodec<? extends feg> $$1) {
      return jt.a(mh.H, alk.b($$0), new fef($$1));
   }
}
