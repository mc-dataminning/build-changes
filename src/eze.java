import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eze {
   private static final Codec<ezd> d = lz.I.q().dispatch(ezd::a, ezc::a);
   public static final Codec<ezd> a = Codec.lazyInitialized(
      () -> Codec.either(eza.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eza $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ezc b = a("fixed", ezb.a);
   public static final ezc c = a("context", eza.a);

   private static ezc a(String $$0, MapCodec<? extends ezd> $$1) {
      return kd.a(lz.I, alj.b($$0), new ezc($$1));
   }
}
