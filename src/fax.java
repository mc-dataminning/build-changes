import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fax {
   private static final Codec<faw> d = ma.I.q().dispatch(faw::a, fav::a);
   public static final Codec<faw> a = Codec.lazyInitialized(
      () -> Codec.either(fat.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fat $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fav b = a("fixed", fau.a);
   public static final fav c = a("context", fat.a);

   private static fav a(String $$0, MapCodec<? extends faw> $$1) {
      return kd.a(ma.I, alp.b($$0), new fav($$1));
   }
}
