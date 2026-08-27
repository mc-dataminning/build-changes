import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bjd implements bji {
   private static final Codec<Either<Float, bjd>> a = Codec.either(Codec.FLOAT, kd.L.q().dispatch(bjd::c, bje::codec));
   public static final Codec<bjd> c = a.xmap(
      $$0 -> (bjd)$$0.map(bjb::a, $$0x -> $$0x), $$0 -> $$0.c() == bje.a ? Either.left(((bjb)$$0).d()) : Either.right($$0)
   );

   public static Codec<bjd> a(float $$0, float $$1) {
      return atv.a(c, (Function<bjd, DataResult<bjd>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bje<?> c();
}
