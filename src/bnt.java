import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bnt implements bny {
   private static final Codec<Either<Float, bnt>> a = Codec.either(Codec.FLOAT, lc.L.q().dispatch(bnt::c, bnu::codec));
   public static final Codec<bnt> c = a.xmap(
      $$0 -> (bnt)$$0.map(bnr::a, $$0x -> $$0x), $$0 -> $$0.c() == bnu.a ? Either.left(((bnr)$$0).d()) : Either.right($$0)
   );

   public static Codec<bnt> a(float $$0, float $$1) {
      return axe.b(c, (Function<bnt, DataResult<bnt>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bnu<?> c();
}
