import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fed {
   private static final Codec<fec> d = mg.I.q().dispatch(fec::a, feb::a);
   public static final Codec<fec> a = Codec.lazyInitialized(
      () -> Codec.either(fdz.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fdz $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final feb b = a("fixed", fea.a);
   public static final feb c = a("context", fdz.a);

   private static feb a(String $$0, MapCodec<? extends fec> $$1) {
      return js.a(mg.I, alg.b($$0), new feb($$1));
   }
}
