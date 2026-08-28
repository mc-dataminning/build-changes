import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewg {
   private static final Codec<ewf> d = lt.I.r().dispatch(ewf::a, ewe::a);
   public static final Codec<ewf> a = Codec.lazyInitialized(
      () -> Codec.either(ewc.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof ewc $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final ewe b = a("fixed", ewd.a);
   public static final ewe c = a("context", ewc.a);

   private static ewe a(String $$0, MapCodec<? extends ewf> $$1) {
      return jz.a(lt.I, akr.b($$0), new ewe($$1));
   }
}
