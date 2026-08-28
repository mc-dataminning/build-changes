import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fef {
   private static final Codec<fee> d = mg.H.q().dispatch(fee::a, fed::a);
   public static final Codec<fee> a = Codec.lazyInitialized(
      () -> Codec.either(fec.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fec $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fed b = a("storage", feg.a);
   public static final fed c = a("context", fec.b);

   private static fed a(String $$0, MapCodec<? extends fee> $$1) {
      return js.a(mg.H, ali.b($$0), new fed($$1));
   }
}
