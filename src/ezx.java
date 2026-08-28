import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezx {
   private static final Codec<ezw> h = mb.G.q().dispatch(ezw::b, ezv::a);
   public static final Codec<ezw> a = Codec.lazyInitialized(() -> {
      Codec<ezw> $$0 = Codec.withAlternative(h, faa.a.codec());
      return Codec.either(ezt.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof ezt $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final ezv b = a("constant", ezt.a);
   public static final ezv c = a("uniform", faa.a);
   public static final ezv d = a("binomial", ezs.a);
   public static final ezv e = a("score", ezy.a);
   public static final ezv f = a("storage", ezz.a);
   public static final ezv g = a("enchantment_level", ezu.a);

   private static ezv a(String $$0, MapCodec<? extends ezw> $$1) {
      return ke.a(mb.G, aku.b($$0), new ezv($$1));
   }
}
