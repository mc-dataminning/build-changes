import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euj {
   private static final Codec<eui> g = lp.I.q().dispatch(eui::b, euh::a);
   public static final Codec<eui> a = Codec.lazyInitialized(() -> {
      Codec<eui> $$0 = Codec.withAlternative(g, eum.a.codec());
      return Codec.either(eug.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eug $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final euh b = a("constant", eug.a);
   public static final euh c = a("uniform", eum.a);
   public static final euh d = a("binomial", euf.a);
   public static final euh e = a("score", euk.a);
   public static final euh f = a("storage", eul.a);

   private static euh a(String $$0, MapCodec<? extends eui> $$1) {
      return jv.a(lp.I, new alb($$0), new euh($$1));
   }
}
