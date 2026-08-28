import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exy {
   private static final Codec<exx> d = lu.I.q().dispatch(exx::a, exw::a);
   public static final Codec<exx> a = Codec.lazyInitialized(
      () -> Codec.either(exu.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof exu $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final exw b = a("fixed", exv.a);
   public static final exw c = a("context", exu.a);

   private static exw a(String $$0, MapCodec<? extends exx> $$1) {
      return ka.a(lu.I, alc.b($$0), new exw($$1));
   }
}
