import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fay {
   private static final Codec<fax> d = ma.I.q().dispatch(fax::a, faw::a);
   public static final Codec<fax> a = Codec.lazyInitialized(
      () -> Codec.either(fau.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fau $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final faw b = a("fixed", fav.a);
   public static final faw c = a("context", fau.a);

   private static faw a(String $$0, MapCodec<? extends fax> $$1) {
      return kd.a(ma.I, alz.b($$0), new faw($$1));
   }
}
