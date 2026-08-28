import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezw {
   private static final Codec<ezv> h = mb.G.q().dispatch(ezv::b, ezu::a);
   public static final Codec<ezv> a = Codec.lazyInitialized(() -> {
      Codec<ezv> $$0 = Codec.withAlternative(h, ezz.a.codec());
      return Codec.either(ezs.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof ezs $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final ezu b = a("constant", ezs.a);
   public static final ezu c = a("uniform", ezz.a);
   public static final ezu d = a("binomial", ezr.a);
   public static final ezu e = a("score", ezx.a);
   public static final ezu f = a("storage", ezy.a);
   public static final ezu g = a("enchantment_level", ezt.a);

   private static ezu a(String $$0, MapCodec<? extends ezv> $$1) {
      return ke.a(mb.G, akv.b($$0), new ezu($$1));
   }
}
