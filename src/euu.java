import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euu {
   private static final Codec<eut> d = lq.H.r().dispatch(eut::a, eus::a);
   public static final Codec<eut> a = Codec.lazyInitialized(
      () -> Codec.either(eur.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eur $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eus b = a("storage", euv.a);
   public static final eus c = a("context", eur.b);

   private static eus a(String $$0, MapCodec<? extends eut> $$1) {
      return jw.a(lq.H, new akk($$0), new eus($$1));
   }
}
