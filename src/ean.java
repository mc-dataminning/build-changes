import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ean {
   private static final Codec<Either<dsk, ean>> a = Codec.either(dsk.a, kh.N.q().dispatch(ean::a, eao::codec));
   public static final Codec<ean> c = a.xmap(
      $$0 -> (ean)$$0.map(eam::a, $$0x -> $$0x), $$0 -> $$0.a() == eao.a ? Either.left(((eam)$$0).b()) : Either.right($$0)
   );

   public abstract int a(awt var1, dsn var2);

   public abstract eao<?> a();
}
