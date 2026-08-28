import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eke {
   private static final Codec<Either<ebz, eke>> a = Codec.either(ebz.a, ly.L.q().dispatch(eke::a, ekf::codec));
   public static final Codec<eke> c = a.xmap(
      $$0 -> (eke)$$0.map(ekd::a, $$0x -> $$0x), $$0 -> $$0.a() == ekf.a ? Either.left(((ekd)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azs var1, ecc var2);

   public abstract ekf<?> a();
}
