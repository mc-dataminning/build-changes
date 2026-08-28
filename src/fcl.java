import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fcl {
   private static final Codec<fck> d = mf.H.q().dispatch(fck::a, fcj::a);
   public static final Codec<fck> a = Codec.lazyInitialized(
      () -> Codec.either(fci.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fci $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fcj b = a("storage", fcm.a);
   public static final fcj c = a("context", fci.b);

   private static fcj a(String $$0, MapCodec<? extends fck> $$1) {
      return jr.a(mf.H, ale.b($$0), new fcj($$1));
   }
}
