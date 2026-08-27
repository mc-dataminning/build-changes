import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bkx implements blc {
   private static final Codec<Either<Float, bkx>> a = Codec.either(Codec.FLOAT, kf.L.q().dispatch(bkx::c, bky::codec));
   public static final Codec<bkx> c = a.xmap(
      $$0 -> (bkx)$$0.map(bkv::a, $$0x -> $$0x), $$0 -> $$0.c() == bky.a ? Either.left(((bkv)$$0).d()) : Either.right($$0)
   );

   public static Codec<bkx> a(float $$0, float $$1) {
      return avp.a(c, (Function<bkx, DataResult<bkx>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bky<?> c();
}
