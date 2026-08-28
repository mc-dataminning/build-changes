import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdn {
   private static final Codec<fdm> h = mf.G.q().dispatch(fdm::b, fdl::a);
   public static final Codec<fdm> a = Codec.lazyInitialized(() -> {
      Codec<fdm> $$0 = Codec.withAlternative(h, fdq.a.codec());
      return Codec.either(fdj.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fdj $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fdl b = a("constant", fdj.a);
   public static final fdl c = a("uniform", fdq.a);
   public static final fdl d = a("binomial", fdi.a);
   public static final fdl e = a("score", fdo.a);
   public static final fdl f = a("storage", fdp.a);
   public static final fdl g = a("enchantment_level", fdk.a);

   private static fdl a(String $$0, MapCodec<? extends fdm> $$1) {
      return jr.a(mf.G, alg.b($$0), new fdl($$1));
   }
}
