import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyt {
   private static final Codec<eys> d = ly.I.q().dispatch(eys::a, eyr::a);
   public static final Codec<eys> a = Codec.lazyInitialized(
      () -> Codec.either(eyp.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof eyp $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eyr b = a("fixed", eyq.a);
   public static final eyr c = a("context", eyp.a);

   private static eyr a(String $$0, MapCodec<? extends eys> $$1) {
      return kd.a(ly.I, ali.b($$0), new eyr($$1));
   }
}
