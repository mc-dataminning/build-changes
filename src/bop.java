import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bop implements bou {
   private static final Codec<Either<Float, bop>> a = Codec.either(Codec.FLOAT, ld.L.q().dispatch(bop::c, boq::codec));
   public static final Codec<bop> c = a.xmap(
      $$0 -> (bop)$$0.map(bon::a, $$0x -> $$0x), $$0 -> $$0.c() == boq.a ? Either.left(((bon)$$0).d()) : Either.right($$0)
   );

   public static Codec<bop> a(float $$0, float $$1) {
      return axh.b(c, (Function<bop, DataResult<bop>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract boq<?> c();
}
