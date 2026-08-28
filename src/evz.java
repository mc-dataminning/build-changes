import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evz {
   private static final Codec<evy> h = lt.G.r().dispatch(evy::b, evx::a);
   public static final Codec<evy> a = Codec.lazyInitialized(() -> {
      Codec<evy> $$0 = Codec.withAlternative(h, ewc.a.codec());
      return Codec.either(evv.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof evv $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final evx b = a("constant", evv.a);
   public static final evx c = a("uniform", ewc.a);
   public static final evx d = a("binomial", evu.a);
   public static final evx e = a("score", ewa.a);
   public static final evx f = a("storage", ewb.a);
   public static final evx g = a("enchantment_level", evw.a);

   private static evx a(String $$0, MapCodec<? extends evy> $$1) {
      return jz.a(lt.G, akr.b($$0), new evx($$1));
   }
}
