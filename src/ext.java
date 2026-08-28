import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ext {
   private static final Codec<exs> h = lv.G.q().dispatch(exs::b, exr::a);
   public static final Codec<exs> a = Codec.lazyInitialized(() -> {
      Codec<exs> $$0 = Codec.withAlternative(h, exw.a.codec());
      return Codec.either(exp.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof exp $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final exr b = a("constant", exp.a);
   public static final exr c = a("uniform", exw.a);
   public static final exr d = a("binomial", exo.a);
   public static final exr e = a("score", exu.a);
   public static final exr f = a("storage", exv.a);
   public static final exr g = a("enchantment_level", exq.a);

   private static exr a(String $$0, MapCodec<? extends exs> $$1) {
      return kb.a(lv.G, ale.b($$0), new exr($$1));
   }
}
