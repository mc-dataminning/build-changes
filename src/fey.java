import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fey {
   private static final Codec<fex> d = mh.I.q().dispatch(fex::a, few::a);
   public static final Codec<fex> a = Codec.lazyInitialized(
      () -> Codec.either(feu.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof feu $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final few b = a("fixed", fev.a);
   public static final few c = a("context", feu.a);

   private static few a(String $$0, MapCodec<? extends fex> $$1) {
      return jt.a(mh.I, alk.b($$0), new few($$1));
   }
}
