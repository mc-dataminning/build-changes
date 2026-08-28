import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyg {
   private static final Codec<eyf> d = lz.H.q().dispatch(eyf::a, eye::a);
   public static final Codec<eyf> a = Codec.lazyInitialized(
      () -> Codec.either(eyd.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eyd $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eye b = a("storage", eyh.a);
   public static final eye c = a("context", eyd.b);

   private static eye a(String $$0, MapCodec<? extends eyf> $$1) {
      return kd.a(lz.H, all.b($$0), new eye($$1));
   }
}
