import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exp {
   private static final Codec<exo> h = lu.G.q().dispatch(exo::b, exn::a);
   public static final Codec<exo> a = Codec.lazyInitialized(() -> {
      Codec<exo> $$0 = Codec.withAlternative(h, exs.a.codec());
      return Codec.either(exl.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof exl $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final exn b = a("constant", exl.a);
   public static final exn c = a("uniform", exs.a);
   public static final exn d = a("binomial", exk.a);
   public static final exn e = a("score", exq.a);
   public static final exn f = a("storage", exr.a);
   public static final exn g = a("enchantment_level", exm.a);

   private static exn a(String $$0, MapCodec<? extends exo> $$1) {
      return ka.a(lu.G, alc.b($$0), new exn($$1));
   }
}
