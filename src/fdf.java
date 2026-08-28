import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdf {
   private static final Codec<fde> h = mf.G.q().dispatch(fde::b, fdd::a);
   public static final Codec<fde> a = Codec.lazyInitialized(() -> {
      Codec<fde> $$0 = Codec.withAlternative(h, fdi.a.codec());
      return Codec.either(fdb.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fdb $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fdd b = a("constant", fdb.a);
   public static final fdd c = a("uniform", fdi.a);
   public static final fdd d = a("binomial", fda.a);
   public static final fdd e = a("score", fdg.a);
   public static final fdd f = a("storage", fdh.a);
   public static final fdd g = a("enchantment_level", fdc.a);

   private static fdd a(String $$0, MapCodec<? extends fde> $$1) {
      return jr.a(mf.G, alg.b($$0), new fdd($$1));
   }
}
