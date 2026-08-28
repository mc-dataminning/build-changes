import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exl {
   private static final Codec<exk> d = lv.H.q().dispatch(exk::a, exj::a);
   public static final Codec<exk> a = Codec.lazyInitialized(
      () -> Codec.either(exi.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof exi $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final exj b = a("storage", exm.a);
   public static final exj c = a("context", exi.b);

   private static exj a(String $$0, MapCodec<? extends exk> $$1) {
      return kb.a(lv.H, ale.b($$0), new exj($$1));
   }
}
