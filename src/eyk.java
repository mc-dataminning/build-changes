import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyk {
   private static final Codec<eyj> h = ly.G.q().dispatch(eyj::b, eyi::a);
   public static final Codec<eyj> a = Codec.lazyInitialized(() -> {
      Codec<eyj> $$0 = Codec.withAlternative(h, eyn.a.codec());
      return Codec.either(eyg.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eyg $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eyi b = a("constant", eyg.a);
   public static final eyi c = a("uniform", eyn.a);
   public static final eyi d = a("binomial", eyf.a);
   public static final eyi e = a("score", eyl.a);
   public static final eyi f = a("storage", eym.a);
   public static final eyi g = a("enchantment_level", eyh.a);

   private static eyi a(String $$0, MapCodec<? extends eyj> $$1) {
      return kd.a(ly.G, ali.b($$0), new eyi($$1));
   }
}
