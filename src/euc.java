import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euc {
   private static final Codec<eub> d = lp.J.q().dispatch(eub::a, eua::a);
   public static final Codec<eub> a = Codec.lazyInitialized(
      () -> Codec.either(etz.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof etz $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final eua b = a("storage", eud.a);
   public static final eua c = a("context", etz.b);

   private static eua a(String $$0, MapCodec<? extends eub> $$1) {
      return jv.a(lp.J, new alb($$0), new eua($$1));
   }
}
