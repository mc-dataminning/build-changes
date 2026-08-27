import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dxm {
   private static final Codec<Either<dpj, dxm>> a = Codec.either(dpj.a, kd.N.q().dispatch(dxm::a, dxn::codec));
   public static final Codec<dxm> c = a.xmap(
      $$0 -> (dxm)$$0.map(dxl::a, $$0x -> $$0x), $$0 -> $$0.a() == dxn.a ? Either.left(((dxl)$$0).b()) : Either.right($$0)
   );

   public abstract int a(auu var1, dpm var2);

   public abstract dxn<?> a();
}
