import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fbr {
   private static final Codec<fbq> h = md.G.q().dispatch(fbq::b, fbp::a);
   public static final Codec<fbq> a = Codec.lazyInitialized(() -> {
      Codec<fbq> $$0 = Codec.withAlternative(h, fbu.a.codec());
      return Codec.either(fbn.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fbn $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fbp b = a("constant", fbn.a);
   public static final fbp c = a("uniform", fbu.a);
   public static final fbp d = a("binomial", fbm.a);
   public static final fbp e = a("score", fbs.a);
   public static final fbp f = a("storage", fbt.a);
   public static final fbp g = a("enchantment_level", fbo.a);

   private static fbp a(String $$0, MapCodec<? extends fbq> $$1) {
      return kf.a(md.G, ald.b($$0), new fbp($$1));
   }
}
