import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fam {
   private static final Codec<fal> d = mb.H.q().dispatch(fal::a, fak::a);
   public static final Codec<fal> a = Codec.lazyInitialized(
      () -> Codec.either(faj.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof faj $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fak b = a("storage", fan.a);
   public static final fak c = a("context", faj.b);

   private static fak a(String $$0, MapCodec<? extends fal> $$1) {
      return ke.a(mb.H, aku.b($$0), new fak($$1));
   }
}
