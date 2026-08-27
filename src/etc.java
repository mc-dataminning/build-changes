import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etc {
   private static final Codec<etb> d = le.J.q().dispatch(etb::a, eta::a);
   public static final Codec<etb> a = Codec.lazyInitialized(
      () -> Codec.either(esz.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof esz $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eta b = a("storage", etd.a);
   public static final eta c = a("context", esz.b);

   private static eta a(String $$0, MapCodec<? extends etb> $$1) {
      return jk.a(le.J, new akn($$0), new eta($$1));
   }
}
