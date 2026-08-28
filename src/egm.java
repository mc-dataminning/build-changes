import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class egm {
   private static final Codec<Either<dyj, egm>> a = Codec.either(dyj.a, lp.N.q().dispatch(egm::a, egn::codec));
   public static final Codec<egm> c = a.xmap(
      $$0 -> (egm)$$0.map(egl::a, $$0x -> $$0x), $$0 -> $$0.a() == egn.a ? Either.left(((egl)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azc var1, dym var2);

   public abstract egn<?> a();
}
