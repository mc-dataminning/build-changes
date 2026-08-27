import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bhe implements bhj {
   private static final Codec<Either<Float, bhe>> a = Codec.either(Codec.FLOAT, jy.M.q().dispatch(bhe::c, bhf::codec));
   public static final Codec<bhe> c = a.xmap(
      $$0 -> (bhe)$$0.map(bhc::a, $$0x -> $$0x), $$0 -> $$0.c() == bhf.a ? Either.left(((bhc)$$0).d()) : Either.right($$0)
   );

   public static Codec<bhe> a(float $$0, float $$1) {
      return asg.a(c, (Function<bhe, DataResult<bhe>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bhf<?> c();
}
