import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euo {
   private static final Codec<eun> g = lp.I.q().dispatch(eun::b, eum::a);
   public static final Codec<eun> a = Codec.lazyInitialized(() -> {
      Codec<eun> $$0 = Codec.withAlternative(g, eur.a.codec());
      return Codec.either(eul.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eul $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eum b = a("constant", eul.a);
   public static final eum c = a("uniform", eur.a);
   public static final eum d = a("binomial", euk.a);
   public static final eum e = a("score", eup.a);
   public static final eum f = a("storage", euq.a);

   private static eum a(String $$0, MapCodec<? extends eun> $$1) {
      return jv.a(lp.I, new alf($$0), new eum($$1));
   }
}
