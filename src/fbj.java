import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fbj {
   private static final Codec<fbi> d = md.H.q().dispatch(fbi::a, fbh::a);
   public static final Codec<fbi> a = Codec.lazyInitialized(
      () -> Codec.either(fbg.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fbg $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fbh b = a("storage", fbk.a);
   public static final fbh c = a("context", fbg.b);

   private static fbh a(String $$0, MapCodec<? extends fbi> $$1) {
      return kf.a(md.H, ald.b($$0), new fbh($$1));
   }
}
