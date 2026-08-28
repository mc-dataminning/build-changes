import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezo {
   private static final Codec<ezn> d = mb.H.q().dispatch(ezn::a, ezm::a);
   public static final Codec<ezn> a = Codec.lazyInitialized(
      () -> Codec.either(ezl.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ezl $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ezm b = a("storage", ezp.a);
   public static final ezm c = a("context", ezl.b);

   private static ezm a(String $$0, MapCodec<? extends ezn> $$1) {
      return ke.a(mb.H, akv.b($$0), new ezm($$1));
   }
}
