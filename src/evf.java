import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evf {
   private static final Codec<eve> d = lq.I.r().dispatch(eve::a, evd::a);
   public static final Codec<eve> a = Codec.lazyInitialized(
      () -> Codec.either(evb.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof evb $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final evd b = a("fixed", evc.a);
   public static final evd c = a("context", evb.a);

   private static evd a(String $$0, MapCodec<? extends eve> $$1) {
      return jw.a(lq.I, new akk($$0), new evd($$1));
   }
}
