import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fen {
   private static final Codec<fem> h = mg.G.q().dispatch(fem::b, fel::a);
   public static final Codec<fem> a = Codec.lazyInitialized(() -> {
      Codec<fem> $$0 = Codec.withAlternative(h, feq.a.codec());
      return Codec.either(fej.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fej $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fel b = a("constant", fej.a);
   public static final fel c = a("uniform", feq.a);
   public static final fel d = a("binomial", fei.a);
   public static final fel e = a("score", feo.a);
   public static final fel f = a("storage", fep.a);
   public static final fel g = a("enchantment_level", fek.a);

   private static fel a(String $$0, MapCodec<? extends fem> $$1) {
      return js.a(mg.G, ali.b($$0), new fel($$1));
   }
}
