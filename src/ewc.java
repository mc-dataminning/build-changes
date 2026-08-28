import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewc {
   private static final Codec<ewb> d = lt.I.r().dispatch(ewb::a, ewa::a);
   public static final Codec<ewb> a = Codec.lazyInitialized(
      () -> Codec.either(evy.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof evy $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ewa b = a("fixed", evz.a);
   public static final ewa c = a("context", evy.a);

   private static ewa a(String $$0, MapCodec<? extends ewb> $$1) {
      return jz.a(lt.I, akq.b($$0), new ewa($$1));
   }
}
