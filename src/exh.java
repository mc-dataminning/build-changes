import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exh {
   private static final Codec<exg> d = lu.H.q().dispatch(exg::a, exf::a);
   public static final Codec<exg> a = Codec.lazyInitialized(
      () -> Codec.either(exe.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof exe $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final exf b = a("storage", exi.a);
   public static final exf c = a("context", exe.b);

   private static exf a(String $$0, MapCodec<? extends exg> $$1) {
      return ka.a(lu.H, alc.b($$0), new exf($$1));
   }
}
