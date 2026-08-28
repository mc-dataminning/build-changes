import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evx {
   private static final Codec<evw> h = lt.G.r().dispatch(evw::b, evv::a);
   public static final Codec<evw> a = Codec.lazyInitialized(() -> {
      Codec<evw> $$0 = Codec.withAlternative(h, ewa.a.codec());
      return Codec.either(evt.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof evt $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final evv b = a("constant", evt.a);
   public static final evv c = a("uniform", ewa.a);
   public static final evv d = a("binomial", evs.a);
   public static final evv e = a("score", evy.a);
   public static final evv f = a("storage", evz.a);
   public static final evv g = a("enchantment_level", evu.a);

   private static evv a(String $$0, MapCodec<? extends evw> $$1) {
      return jz.a(lt.G, akr.b($$0), new evv($$1));
   }
}
