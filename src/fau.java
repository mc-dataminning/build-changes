import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fau {
   private static final Codec<fat> h = mb.G.q().dispatch(fat::b, fas::a);
   public static final Codec<fat> a = Codec.lazyInitialized(() -> {
      Codec<fat> $$0 = Codec.withAlternative(h, fax.a.codec());
      return Codec.either(faq.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof faq $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fas b = a("constant", faq.a);
   public static final fas c = a("uniform", fax.a);
   public static final fas d = a("binomial", fap.a);
   public static final fas e = a("score", fav.a);
   public static final fas f = a("storage", faw.a);
   public static final fas g = a("enchantment_level", far.a);

   private static fas a(String $$0, MapCodec<? extends fat> $$1) {
      return ke.a(mb.G, aku.b($$0), new fas($$1));
   }
}
