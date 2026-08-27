import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bfw implements bgb {
   private static final Codec<Either<Float, bfw>> a = Codec.either(Codec.FLOAT, jd.M.q().dispatch(bfw::c, bfx::codec));
   public static final Codec<bfw> c = a.xmap(
      $$0 -> (bfw)$$0.map(bfu::a, $$0x -> $$0x), $$0 -> $$0.c() == bfx.a ? Either.left(((bfu)$$0).d()) : Either.right($$0)
   );

   public static Codec<bfw> a(float $$0, float $$1) {
      return arb.a(c, (Function<bfw, DataResult<bfw>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bfx<?> c();
}
