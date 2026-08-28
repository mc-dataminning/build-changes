import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evl {
   private static final Codec<evk> d = lt.H.r().dispatch(evk::a, evj::a);
   public static final Codec<evk> a = Codec.lazyInitialized(
      () -> Codec.either(evi.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof evi $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final evj b = a("storage", evm.a);
   public static final evj c = a("context", evi.b);

   private static evj a(String $$0, MapCodec<? extends evk> $$1) {
      return jz.a(lt.H, akq.b($$0), new evj($$1));
   }
}
