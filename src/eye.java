import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eye {
   private static final Codec<eyd> h = lx.G.q().dispatch(eyd::b, eyc::a);
   public static final Codec<eyd> a = Codec.lazyInitialized(() -> {
      Codec<eyd> $$0 = Codec.withAlternative(h, eyh.a.codec());
      return Codec.either(eya.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eya $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final eyc b = a("constant", eya.a);
   public static final eyc c = a("uniform", eyh.a);
   public static final eyc d = a("binomial", exz.a);
   public static final eyc e = a("score", eyf.a);
   public static final eyc f = a("storage", eyg.a);
   public static final eyc g = a("enchantment_level", eyb.a);

   private static eyc a(String $$0, MapCodec<? extends eyd> $$1) {
      return kc.a(lx.G, alh.b($$0), new eyc($$1));
   }
}
