import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdz {
   private static final Codec<fdy> h = mg.G.q().dispatch(fdy::b, fdx::a);
   public static final Codec<fdy> a = Codec.lazyInitialized(() -> {
      Codec<fdy> $$0 = Codec.withAlternative(h, fec.a.codec());
      return Codec.either(fdv.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fdv $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fdx b = a("constant", fdv.a);
   public static final fdx c = a("uniform", fec.a);
   public static final fdx d = a("binomial", fdu.a);
   public static final fdx e = a("score", fea.a);
   public static final fdx f = a("storage", feb.a);
   public static final fdx g = a("enchantment_level", fdw.a);

   private static fdx a(String $$0, MapCodec<? extends fdy> $$1) {
      return js.a(mg.G, alg.b($$0), new fdx($$1));
   }
}
