import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fap {
   private static final Codec<fao> h = ma.G.q().dispatch(fao::b, fan::a);
   public static final Codec<fao> a = Codec.lazyInitialized(() -> {
      Codec<fao> $$0 = Codec.withAlternative(h, fas.a.codec());
      return Codec.either(fal.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fal $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fan b = a("constant", fal.a);
   public static final fan c = a("uniform", fas.a);
   public static final fan d = a("binomial", fak.a);
   public static final fan e = a("score", faq.a);
   public static final fan f = a("storage", far.a);
   public static final fan g = a("enchantment_level", fam.a);

   private static fan a(String $$0, MapCodec<? extends fao> $$1) {
      return kd.a(ma.G, alz.b($$0), new fan($$1));
   }
}
