import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euq {
   private static final Codec<eup> g = lp.I.q().dispatch(eup::b, euo::a);
   public static final Codec<eup> a = Codec.lazyInitialized(() -> {
      Codec<eup> $$0 = Codec.withAlternative(g, eut.a.codec());
      return Codec.either(eun.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eun $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final euo b = a("constant", eun.a);
   public static final euo c = a("uniform", eut.a);
   public static final euo d = a("binomial", eum.a);
   public static final euo e = a("score", eur.a);
   public static final euo f = a("storage", eus.a);

   private static euo a(String $$0, MapCodec<? extends eup> $$1) {
      return jv.a(lp.I, new alf($$0), new euo($$1));
   }
}
