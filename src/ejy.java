import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ejy {
   private static final Codec<Either<ebt, ejy>> a = Codec.either(ebt.a, lx.L.q().dispatch(ejy::a, ejz::codec));
   public static final Codec<ejy> c = a.xmap(
      $$0 -> (ejy)$$0.map(ejx::a, $$0x -> $$0x), $$0 -> $$0.a() == ejz.a ? Either.left(((ejx)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azr var1, ebw var2);

   public abstract ejz<?> a();
}
