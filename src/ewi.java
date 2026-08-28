import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewi {
   private static final Codec<ewh> d = lt.I.r().dispatch(ewh::a, ewg::a);
   public static final Codec<ewh> a = Codec.lazyInitialized(
      () -> Codec.either(ewe.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ewe $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ewg b = a("fixed", ewf.a);
   public static final ewg c = a("context", ewe.a);

   private static ewg a(String $$0, MapCodec<? extends ewh> $$1) {
      return jz.a(lt.I, akr.b($$0), new ewg($$1));
   }
}
