import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evn {
   private static final Codec<evm> d = lq.I.r().dispatch(evm::a, evl::a);
   public static final Codec<evm> a = Codec.lazyInitialized(
      () -> Codec.either(evj.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof evj $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final evl b = a("fixed", evk.a);
   public static final evl c = a("context", evj.a);

   private static evl a(String $$0, MapCodec<? extends evm> $$1) {
      return jw.a(lq.I, new akk($$0), new evl($$1));
   }
}
