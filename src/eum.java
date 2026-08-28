import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eum {
   private static final Codec<eul> g = lp.I.q().dispatch(eul::b, euk::a);
   public static final Codec<eul> a = Codec.lazyInitialized(() -> {
      Codec<eul> $$0 = Codec.withAlternative(g, eup.a.codec());
      return Codec.either(euj.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof euj $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final euk b = a("constant", euj.a);
   public static final euk c = a("uniform", eup.a);
   public static final euk d = a("binomial", eui.a);
   public static final euk e = a("score", eun.a);
   public static final euk f = a("storage", euo.a);

   private static euk a(String $$0, MapCodec<? extends eul> $$1) {
      return jv.a(lp.I, new ale($$0), new euk($$1));
   }
}
