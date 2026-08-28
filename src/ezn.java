import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezn {
   private static final Codec<ezm> d = mb.H.q().dispatch(ezm::a, ezl::a);
   public static final Codec<ezm> a = Codec.lazyInitialized(
      () -> Codec.either(ezk.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ezk $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ezl b = a("storage", ezo.a);
   public static final ezl c = a("context", ezk.b);

   private static ezl a(String $$0, MapCodec<? extends ezm> $$1) {
      return ke.a(mb.H, aku.b($$0), new ezl($$1));
   }
}
