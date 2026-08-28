import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyx {
   private static final Codec<eyw> d = lz.I.q().dispatch(eyw::a, eyv::a);
   public static final Codec<eyw> a = Codec.lazyInitialized(
      () -> Codec.either(eyt.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eyt $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eyv b = a("fixed", eyu.a);
   public static final eyv c = a("context", eyt.a);

   private static eyv a(String $$0, MapCodec<? extends eyw> $$1) {
      return kd.a(lz.I, all.b($$0), new eyv($$1));
   }
}
