import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezv {
   private static final Codec<ezu> h = mb.G.q().dispatch(ezu::b, ezt::a);
   public static final Codec<ezu> a = Codec.lazyInitialized(() -> {
      Codec<ezu> $$0 = Codec.withAlternative(h, ezy.a.codec());
      return Codec.either(ezr.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof ezr $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final ezt b = a("constant", ezr.a);
   public static final ezt c = a("uniform", ezy.a);
   public static final ezt d = a("binomial", ezq.a);
   public static final ezt e = a("score", ezw.a);
   public static final ezt f = a("storage", ezx.a);
   public static final ezt g = a("enchantment_level", ezs.a);

   private static ezt a(String $$0, MapCodec<? extends ezu> $$1) {
      return ke.a(mb.G, aku.b($$0), new ezt($$1));
   }
}
