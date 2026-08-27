import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bjf implements bjk {
   private static final Codec<Either<Float, bjf>> a = Codec.either(Codec.FLOAT, kd.L.q().dispatch(bjf::c, bjg::codec));
   public static final Codec<bjf> c = a.xmap(
      $$0 -> (bjf)$$0.map(bjd::a, $$0x -> $$0x), $$0 -> $$0.c() == bjg.a ? Either.left(((bjd)$$0).d()) : Either.right($$0)
   );

   public static Codec<bjf> a(float $$0, float $$1) {
      return atx.a(c, (Function<bjf, DataResult<bjf>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bjg<?> c();
}
