import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewt {
   private static final Codec<ews> d = lu.H.q().dispatch(ews::a, ewr::a);
   public static final Codec<ews> a = Codec.lazyInitialized(
      () -> Codec.either(ewq.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ewq $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ewr b = a("storage", ewu.a);
   public static final ewr c = a("context", ewq.b);

   private static ewr a(String $$0, MapCodec<? extends ews> $$1) {
      return ka.a(lu.H, alb.b($$0), new ewr($$1));
   }
}
