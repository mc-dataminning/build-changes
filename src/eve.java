import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eve {
   private static final Codec<evd> h = lq.G.r().dispatch(evd::b, evc::a);
   public static final Codec<evd> a = Codec.lazyInitialized(() -> {
      Codec<evd> $$0 = Codec.withAlternative(h, evh.a.codec());
      return Codec.either(eva.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof eva $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final evc b = a("constant", eva.a);
   public static final evc c = a("uniform", evh.a);
   public static final evc d = a("binomial", euz.a);
   public static final evc e = a("score", evf.a);
   public static final evc f = a("storage", evg.a);
   public static final evc g = a("enchantment_level", evb.a);

   private static evc a(String $$0, MapCodec<? extends evd> $$1) {
      return jw.a(lq.G, new akk($$0), new evc($$1));
   }
}
