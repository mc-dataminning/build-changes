import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezp {
   private static final Codec<ezo> d = mb.H.q().dispatch(ezo::a, ezn::a);
   public static final Codec<ezo> a = Codec.lazyInitialized(
      () -> Codec.either(ezm.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ezm $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ezn b = a("storage", ezq.a);
   public static final ezn c = a("context", ezm.b);

   private static ezn a(String $$0, MapCodec<? extends ezo> $$1) {
      return ke.a(mb.H, aku.b($$0), new ezn($$1));
   }
}
