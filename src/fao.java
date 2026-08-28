import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fao {
   private static final Codec<fan> h = ma.G.q().dispatch(fan::b, fam::a);
   public static final Codec<fan> a = Codec.lazyInitialized(() -> {
      Codec<fan> $$0 = Codec.withAlternative(h, far.a.codec());
      return Codec.either(fak.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fak $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fam b = a("constant", fak.a);
   public static final fam c = a("uniform", far.a);
   public static final fam d = a("binomial", faj.a);
   public static final fam e = a("score", fap.a);
   public static final fam f = a("storage", faq.a);
   public static final fam g = a("enchantment_level", fal.a);

   private static fam a(String $$0, MapCodec<? extends fan> $$1) {
      return kd.a(ma.G, alp.b($$0), new fam($$1));
   }
}
