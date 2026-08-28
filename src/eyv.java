import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eyv {
   private static final Codec<eyu> h = lz.G.q().dispatch(eyu::b, eyt::a);
   public static final Codec<eyu> a = Codec.lazyInitialized(() -> {
      Codec<eyu> $$0 = Codec.withAlternative(h, eyy.a.codec());
      return Codec.either(eyr.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eyr $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eyt b = a("constant", eyr.a);
   public static final eyt c = a("uniform", eyy.a);
   public static final eyt d = a("binomial", eyq.a);
   public static final eyt e = a("score", eyw.a);
   public static final eyt f = a("storage", eyx.a);
   public static final eyt g = a("enchantment_level", eys.a);

   private static eyt a(String $$0, MapCodec<? extends eyu> $$1) {
      return kd.a(lz.G, alj.b($$0), new eyt($$1));
   }
}
