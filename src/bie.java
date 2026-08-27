import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bie implements bij {
   private static final Codec<Either<Float, bie>> a = Codec.either(Codec.FLOAT, kc.M.q().dispatch(bie::c, bif::codec));
   public static final Codec<bie> c = a.xmap(
      $$0 -> (bie)$$0.map(bic::a, $$0x -> $$0x), $$0 -> $$0.c() == bif.a ? Either.left(((bic)$$0).d()) : Either.right($$0)
   );

   public static Codec<bie> a(float $$0, float $$1) {
      return asy.a(c, (Function<bie, DataResult<bie>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bif<?> c();
}
