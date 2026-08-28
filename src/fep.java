import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fep {
   private static final Codec<feo> h = mh.G.q().dispatch(feo::b, fen::a);
   public static final Codec<feo> a = Codec.lazyInitialized(() -> {
      Codec<feo> $$0 = Codec.withAlternative(h, fes.a.codec());
      return Codec.either(fel.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fel $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fen b = a("constant", fel.a);
   public static final fen c = a("uniform", fes.a);
   public static final fen d = a("binomial", fek.a);
   public static final fen e = a("score", feq.a);
   public static final fen f = a("storage", fer.a);
   public static final fen g = a("enchantment_level", fem.a);

   private static fen a(String $$0, MapCodec<? extends feo> $$1) {
      return jt.a(mh.G, alk.b($$0), new fen($$1));
   }
}
