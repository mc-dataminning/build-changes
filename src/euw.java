import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euw {
   private static final Codec<euv> h = lq.G.r().dispatch(euv::b, euu::a);
   public static final Codec<euv> a = Codec.lazyInitialized(() -> {
      Codec<euv> $$0 = Codec.withAlternative(h, euz.a.codec());
      return Codec.either(eus.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eus $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final euu b = a("constant", eus.a);
   public static final euu c = a("uniform", euz.a);
   public static final euu d = a("binomial", eur.a);
   public static final euu e = a("score", eux.a);
   public static final euu f = a("storage", euy.a);
   public static final euu g = a("enchantment_level", eut.a);

   private static euu a(String $$0, MapCodec<? extends euv> $$1) {
      return jw.a(lq.G, new akk($$0), new euu($$1));
   }
}
