import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdu {
   private static final Codec<fdt> h = mg.G.q().dispatch(fdt::b, fds::a);
   public static final Codec<fdt> a = Codec.lazyInitialized(() -> {
      Codec<fdt> $$0 = Codec.withAlternative(h, fdx.a.codec());
      return Codec.either(fdq.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fdq $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fds b = a("constant", fdq.a);
   public static final fds c = a("uniform", fdx.a);
   public static final fds d = a("binomial", fdp.a);
   public static final fds e = a("score", fdv.a);
   public static final fds f = a("storage", fdw.a);
   public static final fds g = a("enchantment_level", fdr.a);

   private static fds a(String $$0, MapCodec<? extends fdt> $$1) {
      return js.a(mg.G, alg.b($$0), new fds($$1));
   }
}
