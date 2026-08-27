import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class efq {
   private static final Codec<Either<dxn, efq>> a = Codec.either(dxn.a, le.N.q().dispatch(efq::a, efr::codec));
   public static final Codec<efq> c = a.xmap(
      $$0 -> (efq)$$0.map(efp::a, $$0x -> $$0x), $$0 -> $$0.a() == efr.a ? Either.left(((efp)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayk var1, dxq var2);

   public abstract efr<?> a();
}
