import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evp {
   private static final Codec<evo> d = lt.H.r().dispatch(evo::a, evn::a);
   public static final Codec<evo> a = Codec.lazyInitialized(
      () -> Codec.either(evm.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof evm $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final evn b = a("storage", evq.a);
   public static final evn c = a("context", evm.b);

   private static evn a(String $$0, MapCodec<? extends evo> $$1) {
      return jz.a(lt.H, akr.b($$0), new evn($$1));
   }
}
