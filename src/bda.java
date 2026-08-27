import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bda implements bdf {
   private static final Codec<Either<Float, bda>> a = Codec.either(Codec.FLOAT, jb.M.q().dispatch(bda::c, bdb::codec));
   public static final Codec<bda> c = a.xmap(
      $$0 -> (bda)$$0.map(bcy::a, $$0x -> $$0x), $$0 -> $$0.c() == bdb.a ? Either.left(((bcy)$$0).d()) : Either.right($$0)
   );

   public static Codec<bda> a(float $$0, float $$1) {
      return aoi.a(c, (Function<bda, DataResult<bda>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bdb<?> c();
}
