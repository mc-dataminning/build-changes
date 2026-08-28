import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdr {
   private static final Codec<fdq> d = mg.H.q().dispatch(fdq::a, fdp::a);
   public static final Codec<fdq> a = Codec.lazyInitialized(
      () -> Codec.either(fdo.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fdo $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fdp b = a("storage", fds.a);
   public static final fdp c = a("context", fdo.b);

   private static fdp a(String $$0, MapCodec<? extends fdq> $$1) {
      return js.a(mg.H, alg.b($$0), new fdp($$1));
   }
}
