import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezy {
   private static final Codec<ezx> h = mb.G.q().dispatch(ezx::b, ezw::a);
   public static final Codec<ezx> a = Codec.lazyInitialized(() -> {
      Codec<ezx> $$0 = Codec.withAlternative(h, fab.a.codec());
      return Codec.either(ezu.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof ezu $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final ezw b = a("constant", ezu.a);
   public static final ezw c = a("uniform", fab.a);
   public static final ezw d = a("binomial", ezt.a);
   public static final ezw e = a("score", ezz.a);
   public static final ezw f = a("storage", faa.a);
   public static final ezw g = a("enchantment_level", ezv.a);

   private static ezw a(String $$0, MapCodec<? extends ezx> $$1) {
      return ke.a(mb.G, akv.b($$0), new ezw($$1));
   }
}
