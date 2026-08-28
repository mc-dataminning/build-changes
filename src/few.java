import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class few {
   private static final Codec<fev> d = mg.I.q().dispatch(fev::a, feu::a);
   public static final Codec<fev> a = Codec.lazyInitialized(
      () -> Codec.either(fes.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fes $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final feu b = a("fixed", fet.a);
   public static final feu c = a("context", fes.a);

   private static feu a(String $$0, MapCodec<? extends fev> $$1) {
      return js.a(mg.I, ali.b($$0), new feu($$1));
   }
}
