import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bgb implements bgg {
   private static final Codec<Either<Float, bgb>> a = Codec.either(Codec.FLOAT, jd.M.q().dispatch(bgb::c, bgc::codec));
   public static final Codec<bgb> c = a.xmap(
      $$0 -> (bgb)$$0.map(bfz::a, $$0x -> $$0x), $$0 -> $$0.c() == bgc.a ? Either.left(((bfz)$$0).d()) : Either.right($$0)
   );

   public static Codec<bgb> a(float $$0, float $$1) {
      return arg.a(c, (Function<bgb, DataResult<bgb>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bgc<?> c();
}
