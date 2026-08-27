import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class een {
   private static final Codec<Either<dwk, een>> a = Codec.either(dwk.a, lc.N.q().dispatch(een::a, eeo::codec));
   public static final Codec<een> c = a.xmap(
      $$0 -> (een)$$0.map(eem::a, $$0x -> $$0x), $$0 -> $$0.a() == eeo.a ? Either.left(((eem)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayd var1, dwn var2);

   public abstract eeo<?> a();
}
