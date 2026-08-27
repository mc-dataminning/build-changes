import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class edo {
   private static final Codec<Either<dvl, edo>> a = Codec.either(dvl.a, kr.N.q().dispatch(edo::a, edp::codec));
   public static final Codec<edo> c = a.xmap(
      $$0 -> (edo)$$0.map(edn::a, $$0x -> $$0x), $$0 -> $$0.a() == edp.a ? Either.left(((edn)$$0).b()) : Either.right($$0)
   );

   public abstract int a(axr var1, dvo var2);

   public abstract edp<?> a();
}
