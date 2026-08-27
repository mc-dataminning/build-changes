import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dxv {
   private static final Codec<Either<dps, dxv>> a = Codec.either(dps.a, kd.N.q().dispatch(dxv::a, dxw::codec));
   public static final Codec<dxv> c = a.xmap(
      $$0 -> (dxv)$$0.map(dxu::a, $$0x -> $$0x), $$0 -> $$0.a() == dxw.a ? Either.left(((dxu)$$0).b()) : Either.right($$0)
   );

   public abstract int a(auw var1, dpv var2);

   public abstract dxw<?> a();
}
