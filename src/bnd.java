import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bnd implements bni {
   private static final Codec<Either<Float, bnd>> a = Codec.either(Codec.FLOAT, kr.L.q().dispatch(bnd::c, bne::codec));
   public static final Codec<bnd> c = a.xmap(
      $$0 -> (bnd)$$0.map(bnb::a, $$0x -> $$0x), $$0 -> $$0.c() == bne.a ? Either.left(((bnb)$$0).d()) : Either.right($$0)
   );

   public static Codec<bnd> a(float $$0, float $$1) {
      return aws.b(c, (Function<bnd, DataResult<bnd>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bne<?> c();
}
