import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dzs {
   private static final Codec<Either<drp, dzs>> a = Codec.either(drp.a, kf.N.q().dispatch(dzs::a, dzt::codec));
   public static final Codec<dzs> c = a.xmap(
      $$0 -> (dzs)$$0.map(dzr::a, $$0x -> $$0x), $$0 -> $$0.a() == dzt.a ? Either.left(((dzr)$$0).b()) : Either.right($$0)
   );

   public abstract int a(awp var1, drs var2);

   public abstract dzt<?> a();
}
