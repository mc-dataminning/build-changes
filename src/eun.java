import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eun {
   private static final Codec<eum> g = lp.I.q().dispatch(eum::b, eul::a);
   public static final Codec<eum> a = Codec.lazyInitialized(() -> {
      Codec<eum> $$0 = Codec.withAlternative(g, euq.a.codec());
      return Codec.either(euk.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof euk $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eul b = a("constant", euk.a);
   public static final eul c = a("uniform", euq.a);
   public static final eul d = a("binomial", euj.a);
   public static final eul e = a("score", euo.a);
   public static final eul f = a("storage", eup.a);

   private static eul a(String $$0, MapCodec<? extends eum> $$1) {
      return jv.a(lp.I, new ale($$0), new eul($$1));
   }
}
