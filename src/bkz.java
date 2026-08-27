import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bkz implements ble {
   private static final Codec<Either<Float, bkz>> a = Codec.either(Codec.FLOAT, kf.L.q().dispatch(bkz::c, bla::codec));
   public static final Codec<bkz> c = a.xmap(
      $$0 -> (bkz)$$0.map(bkx::a, $$0x -> $$0x), $$0 -> $$0.c() == bla.a ? Either.left(((bkx)$$0).d()) : Either.right($$0)
   );

   public static Codec<bkz> a(float $$0, float $$1) {
      return avq.a(c, (Function<bkz, DataResult<bkz>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bla<?> c();
}
