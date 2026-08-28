import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdw {
   private static final Codec<fdv> d = mf.I.q().dispatch(fdv::a, fdu::a);
   public static final Codec<fdv> a = Codec.lazyInitialized(
      () -> Codec.either(fds.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fds $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fdu b = a("fixed", fdt.a);
   public static final fdu c = a("context", fds.a);

   private static fdu a(String $$0, MapCodec<? extends fdv> $$1) {
      return jr.a(mf.I, alg.b($$0), new fdu($$1));
   }
}
