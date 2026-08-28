import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdo {
   private static final Codec<fdn> d = mf.I.q().dispatch(fdn::a, fdm::a);
   public static final Codec<fdn> a = Codec.lazyInitialized(
      () -> Codec.either(fdk.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fdk $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fdm b = a("fixed", fdl.a);
   public static final fdm c = a("context", fdk.a);

   private static fdm a(String $$0, MapCodec<? extends fdn> $$1) {
      return jr.a(mf.I, alg.b($$0), new fdm($$1));
   }
}
