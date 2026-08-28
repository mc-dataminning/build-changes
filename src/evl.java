import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evl {
   private static final Codec<evk> d = lq.I.r().dispatch(evk::a, evj::a);
   public static final Codec<evk> a = Codec.lazyInitialized(
      () -> Codec.either(evh.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof evh $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final evj b = a("fixed", evi.a);
   public static final evj c = a("context", evh.a);

   private static evj a(String $$0, MapCodec<? extends evk> $$1) {
      return jw.a(lq.I, new akk($$0), new evj($$1));
   }
}
