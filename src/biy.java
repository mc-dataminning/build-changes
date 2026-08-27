import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class biy implements bjd {
   private static final Codec<Either<Float, biy>> a = Codec.either(Codec.FLOAT, kd.L.q().dispatch(biy::c, biz::codec));
   public static final Codec<biy> c = a.xmap(
      $$0 -> (biy)$$0.map(biw::a, $$0x -> $$0x), $$0 -> $$0.c() == biz.a ? Either.left(((biw)$$0).d()) : Either.right($$0)
   );

   public static Codec<biy> a(float $$0, float $$1) {
      return atq.a(c, (Function<biy, DataResult<biy>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract biz<?> c();
}
