import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdc {
   private static final Codec<fdb> d = mf.I.q().dispatch(fdb::a, fda::a);
   public static final Codec<fdb> a = Codec.lazyInitialized(
      () -> Codec.either(fcy.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fcy $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fda b = a("fixed", fcz.a);
   public static final fda c = a("context", fcy.a);

   private static fda a(String $$0, MapCodec<? extends fdb> $$1) {
      return jr.a(mf.I, ale.b($$0), new fda($$1));
   }
}
