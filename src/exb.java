import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exb {
   private static final Codec<exa> h = lu.G.q().dispatch(exa::b, ewz::a);
   public static final Codec<exa> a = Codec.lazyInitialized(() -> {
      Codec<exa> $$0 = Codec.withAlternative(h, exe.a.codec());
      return Codec.either(ewx.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof ewx $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final ewz b = a("constant", ewx.a);
   public static final ewz c = a("uniform", exe.a);
   public static final ewz d = a("binomial", eww.a);
   public static final ewz e = a("score", exc.a);
   public static final ewz f = a("storage", exd.a);
   public static final ewz g = a("enchantment_level", ewy.a);

   private static ewz a(String $$0, MapCodec<? extends exa> $$1) {
      return ka.a(lu.G, alb.b($$0), new ewz($$1));
   }
}
