import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyo {
   private static final Codec<eyn> h = lz.G.q().dispatch(eyn::b, eym::a);
   public static final Codec<eyn> a = Codec.lazyInitialized(() -> {
      Codec<eyn> $$0 = Codec.withAlternative(h, eyr.a.codec());
      return Codec.either(eyk.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eyk $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eym b = a("constant", eyk.a);
   public static final eym c = a("uniform", eyr.a);
   public static final eym d = a("binomial", eyj.a);
   public static final eym e = a("score", eyp.a);
   public static final eym f = a("storage", eyq.a);
   public static final eym g = a("enchantment_level", eyl.a);

   private static eym a(String $$0, MapCodec<? extends eyn> $$1) {
      return kd.a(lz.G, all.b($$0), new eym($$1));
   }
}
