import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ffi {
   private static final Codec<ffh> d = mh.I.q().dispatch(ffh::a, ffg::a);
   public static final Codec<ffh> a = Codec.lazyInitialized(
      () -> Codec.either(ffe.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ffe $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ffg b = a("fixed", fff.a);
   public static final ffg c = a("context", ffe.a);

   private static ffg a(String $$0, MapCodec<? extends ffh> $$1) {
      return jt.a(mh.I, alr.b($$0), new ffg($$1));
   }
}
