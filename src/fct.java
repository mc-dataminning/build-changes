import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fct {
   private static final Codec<fcs> h = mf.G.q().dispatch(fcs::b, fcr::a);
   public static final Codec<fcs> a = Codec.lazyInitialized(() -> {
      Codec<fcs> $$0 = Codec.withAlternative(h, fcw.a.codec());
      return Codec.either(fcp.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fcp $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fcr b = a("constant", fcp.a);
   public static final fcr c = a("uniform", fcw.a);
   public static final fcr d = a("binomial", fco.a);
   public static final fcr e = a("score", fcu.a);
   public static final fcr f = a("storage", fcv.a);
   public static final fcr g = a("enchantment_level", fcq.a);

   private static fcr a(String $$0, MapCodec<? extends fcs> $$1) {
      return jr.a(mf.G, ale.b($$0), new fcr($$1));
   }
}
