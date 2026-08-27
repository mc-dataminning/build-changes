import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eth {
   private static final Codec<etg> g = le.I.q().dispatch(etg::b, etf::a);
   public static final Codec<etg> a = Codec.lazyInitialized(() -> {
      Codec<etg> $$0 = Codec.withAlternative(g, etk.a.codec());
      return Codec.either(ete.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof ete $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final etf b = a("constant", ete.a);
   public static final etf c = a("uniform", etk.a);
   public static final etf d = a("binomial", etd.a);
   public static final etf e = a("score", eti.a);
   public static final etf f = a("storage", etj.a);

   private static etf a(String $$0, MapCodec<? extends etg> $$1) {
      return jk.a(le.I, new akm($$0), new etf($$1));
   }
}
