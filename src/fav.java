import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fav {
   private static final Codec<fau> h = ma.G.q().dispatch(fau::b, fat::a);
   public static final Codec<fau> a = Codec.lazyInitialized(() -> {
      Codec<fau> $$0 = Codec.withAlternative(h, fay.a.codec());
      return Codec.either(far.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof far $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fat b = a("constant", far.a);
   public static final fat c = a("uniform", fay.a);
   public static final fat d = a("binomial", faq.a);
   public static final fat e = a("score", faw.a);
   public static final fat f = a("storage", fax.a);
   public static final fat g = a("enchantment_level", fas.a);

   private static fat a(String $$0, MapCodec<? extends fau> $$1) {
      return kd.a(ma.G, alz.b($$0), new fat($$1));
   }
}
