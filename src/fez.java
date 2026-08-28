import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fez {
   private static final Codec<fey> h = mh.G.q().dispatch(fey::b, fex::a);
   public static final Codec<fey> a = Codec.lazyInitialized(() -> {
      Codec<fey> $$0 = Codec.withAlternative(h, ffc.a.codec());
      return Codec.either(fev.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fev $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fex b = a("constant", fev.a);
   public static final fex c = a("uniform", ffc.a);
   public static final fex d = a("binomial", feu.a);
   public static final fex e = a("score", ffa.a);
   public static final fex f = a("storage", ffb.a);
   public static final fex g = a("enchantment_level", few.a);

   private static fex a(String $$0, MapCodec<? extends fey> $$1) {
      return jt.a(mh.G, alr.b($$0), new fex($$1));
   }
}
