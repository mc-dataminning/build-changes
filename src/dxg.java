import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dxg {
   private static final Codec<Either<dpd, dxg>> a = Codec.either(dpd.a, kd.N.q().dispatch(dxg::a, dxh::codec));
   public static final Codec<dxg> c = a.xmap(
      $$0 -> (dxg)$$0.map(dxf::a, $$0x -> $$0x), $$0 -> $$0.a() == dxh.a ? Either.left(((dxf)$$0).b()) : Either.right($$0)
   );

   public abstract int a(aup var1, dpg var2);

   public abstract dxh<?> a();
}
