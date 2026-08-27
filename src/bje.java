import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bje implements bjj {
   private static final Codec<Either<Float, bje>> a = Codec.either(Codec.FLOAT, kd.L.q().dispatch(bje::c, bjf::codec));
   public static final Codec<bje> c = a.xmap(
      $$0 -> (bje)$$0.map(bjc::a, $$0x -> $$0x), $$0 -> $$0.c() == bjf.a ? Either.left(((bjc)$$0).d()) : Either.right($$0)
   );

   public static Codec<bje> a(float $$0, float $$1) {
      return atw.a(c, (Function<bje, DataResult<bje>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bjf<?> c();
}
