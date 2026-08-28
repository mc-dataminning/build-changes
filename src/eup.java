import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eup {
   private static final Codec<euo> g = lp.I.q().dispatch(euo::b, eun::a);
   public static final Codec<euo> a = Codec.lazyInitialized(() -> {
      Codec<euo> $$0 = Codec.withAlternative(g, eus.a.codec());
      return Codec.either(eum.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eum $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eun b = a("constant", eum.a);
   public static final eun c = a("uniform", eus.a);
   public static final eun d = a("binomial", eul.a);
   public static final eun e = a("score", euq.a);
   public static final eun f = a("storage", eur.a);

   private static eun a(String $$0, MapCodec<? extends euo> $$1) {
      return jv.a(lp.I, new alf($$0), new eun($$1));
   }
}
