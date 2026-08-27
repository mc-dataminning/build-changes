import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class efs {
   private static final Codec<Either<dxp, efs>> a = Codec.either(dxp.a, le.N.q().dispatch(efs::a, eft::codec));
   public static final Codec<efs> c = a.xmap(
      $$0 -> (efs)$$0.map(efr::a, $$0x -> $$0x), $$0 -> $$0.a() == eft.a ? Either.left(((efr)$$0).b()) : Either.right($$0)
   );

   public abstract int a(aym var1, dxs var2);

   public abstract eft<?> a();
}
