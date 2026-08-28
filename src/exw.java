import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exw {
   private static final Codec<exv> d = lx.H.q().dispatch(exv::a, exu::a);
   public static final Codec<exv> a = Codec.lazyInitialized(
      () -> Codec.either(ext.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ext $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final exu b = a("storage", exx.a);
   public static final exu c = a("context", ext.b);

   private static exu a(String $$0, MapCodec<? extends exv> $$1) {
      return kc.a(lx.H, alh.b($$0), new exu($$1));
   }
}
