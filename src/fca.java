import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fca {
   private static final Codec<fbz> d = md.I.q().dispatch(fbz::a, fby::a);
   public static final Codec<fbz> a = Codec.lazyInitialized(
      () -> Codec.either(fbw.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fbw $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fby b = a("fixed", fbx.a);
   public static final fby c = a("context", fbw.a);

   private static fby a(String $$0, MapCodec<? extends fbz> $$1) {
      return kf.a(md.I, ald.b($$0), new fby($$1));
   }
}
