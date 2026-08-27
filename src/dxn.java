import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dxn {
   private static final Codec<Either<dpk, dxn>> a = Codec.either(dpk.a, kd.N.q().dispatch(dxn::a, dxo::codec));
   public static final Codec<dxn> c = a.xmap(
      $$0 -> (dxn)$$0.map(dxm::a, $$0x -> $$0x), $$0 -> $$0.a() == dxo.a ? Either.left(((dxm)$$0).b()) : Either.right($$0)
   );

   public abstract int a(auv var1, dpn var2);

   public abstract dxo<?> a();
}
