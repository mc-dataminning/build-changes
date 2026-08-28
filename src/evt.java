import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evt {
   private static final Codec<evs> h = lt.G.r().dispatch(evs::b, evr::a);
   public static final Codec<evs> a = Codec.lazyInitialized(() -> {
      Codec<evs> $$0 = Codec.withAlternative(h, evw.a.codec());
      return Codec.either(evp.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof evp $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final evr b = a("constant", evp.a);
   public static final evr c = a("uniform", evw.a);
   public static final evr d = a("binomial", evo.a);
   public static final evr e = a("score", evu.a);
   public static final evr f = a("storage", evv.a);
   public static final evr g = a("enchantment_level", evq.a);

   private static evr a(String $$0, MapCodec<? extends evs> $$1) {
      return jz.a(lt.G, akq.b($$0), new evr($$1));
   }
}
