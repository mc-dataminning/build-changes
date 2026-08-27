import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bht implements bhy {
   private static final Codec<Either<Float, bht>> a = Codec.either(Codec.FLOAT, jy.M.q().dispatch(bht::c, bhu::codec));
   public static final Codec<bht> c = a.xmap(
      $$0 -> (bht)$$0.map(bhr::a, $$0x -> $$0x), $$0 -> $$0.c() == bhu.a ? Either.left(((bhr)$$0).d()) : Either.right($$0)
   );

   public static Codec<bht> a(float $$0, float $$1) {
      return asq.a(c, (Function<bht, DataResult<bht>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bhu<?> c();
}
