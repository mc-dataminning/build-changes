import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdm {
   private static final Codec<fdl> d = mg.H.q().dispatch(fdl::a, fdk::a);
   public static final Codec<fdl> a = Codec.lazyInitialized(
      () -> Codec.either(fdj.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fdj $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fdk b = a("storage", fdn.a);
   public static final fdk c = a("context", fdj.b);

   private static fdk a(String $$0, MapCodec<? extends fdl> $$1) {
      return js.a(mg.H, alg.b($$0), new fdk($$1));
   }
}
