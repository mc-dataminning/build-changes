import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bgd implements bgi {
   private static final Codec<Either<Float, bgd>> a = Codec.either(Codec.FLOAT, jd.M.q().dispatch(bgd::c, bge::codec));
   public static final Codec<bgd> c = a.xmap(
      $$0 -> (bgd)$$0.map(bgb::a, $$0x -> $$0x), $$0 -> $$0.c() == bge.a ? Either.left(((bgb)$$0).d()) : Either.right($$0)
   );

   public static Codec<bgd> a(float $$0, float $$1) {
      return arh.a(c, (Function<bgd, DataResult<bgd>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bge<?> c();
}
