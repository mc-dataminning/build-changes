import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezq {
   private static final Codec<ezp> d = mb.H.q().dispatch(ezp::a, ezo::a);
   public static final Codec<ezp> a = Codec.lazyInitialized(
      () -> Codec.either(ezn.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ezn $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ezo b = a("storage", ezr.a);
   public static final ezo c = a("context", ezn.b);

   private static ezo a(String $$0, MapCodec<? extends ezp> $$1) {
      return ke.a(mb.H, akv.b($$0), new ezo($$1));
   }
}
