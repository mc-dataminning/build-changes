import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evr {
   private static final Codec<evq> d = lt.H.r().dispatch(evq::a, evp::a);
   public static final Codec<evq> a = Codec.lazyInitialized(
      () -> Codec.either(evo.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof evo $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final evp b = a("storage", evs.a);
   public static final evp c = a("context", evo.b);

   private static evp a(String $$0, MapCodec<? extends evq> $$1) {
      return jz.a(lt.H, akr.b($$0), new evp($$1));
   }
}
