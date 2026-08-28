import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evc {
   private static final Codec<evb> h = lq.G.r().dispatch(evb::b, eva::a);
   public static final Codec<evb> a = Codec.lazyInitialized(() -> {
      Codec<evb> $$0 = Codec.withAlternative(h, evf.a.codec());
      return Codec.either(euy.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof euy $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eva b = a("constant", euy.a);
   public static final eva c = a("uniform", evf.a);
   public static final eva d = a("binomial", eux.a);
   public static final eva e = a("score", evd.a);
   public static final eva f = a("storage", eve.a);
   public static final eva g = a("enchantment_level", euz.a);

   private static eva a(String $$0, MapCodec<? extends evb> $$1) {
      return jw.a(lq.G, new akk($$0), new eva($$1));
   }
}
