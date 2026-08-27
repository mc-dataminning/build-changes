import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etj {
   private static final Codec<eti> g = le.I.q().dispatch(eti::b, eth::a);
   public static final Codec<eti> a = Codec.lazyInitialized(() -> {
      Codec<eti> $$0 = Codec.withAlternative(g, etm.a.codec());
      return Codec.either(etg.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof etg $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eth b = a("constant", etg.a);
   public static final eth c = a("uniform", etm.a);
   public static final eth d = a("binomial", etf.a);
   public static final eth e = a("score", etk.a);
   public static final eth f = a("storage", etl.a);

   private static eth a(String $$0, MapCodec<? extends eti> $$1) {
      return jk.a(le.I, new akn($$0), new eth($$1));
   }
}
