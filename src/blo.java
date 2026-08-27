import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class blo implements blt {
   private static final Codec<Either<Float, blo>> a = Codec.either(Codec.FLOAT, kh.L.q().dispatch(blo::c, blp::codec));
   public static final Codec<blo> c = a.xmap(
      $$0 -> (blo)$$0.map(blm::a, $$0x -> $$0x), $$0 -> $$0.c() == blp.a ? Either.left(((blm)$$0).d()) : Either.right($$0)
   );

   public static Codec<blo> a(float $$0, float $$1) {
      return avu.a(c, (Function<blo, DataResult<blo>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract blp<?> c();
}
