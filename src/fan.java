import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fan {
   private static final Codec<fam> d = ma.H.q().dispatch(fam::a, fal::a);
   public static final Codec<fam> a = Codec.lazyInitialized(
      () -> Codec.either(fak.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fak $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fal b = a("storage", fao.a);
   public static final fal c = a("context", fak.b);

   private static fal a(String $$0, MapCodec<? extends fam> $$1) {
      return kd.a(ma.H, alz.b($$0), new fal($$1));
   }
}
