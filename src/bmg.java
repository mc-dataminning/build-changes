import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bmg implements bml {
   private static final Codec<Either<Float, bmg>> a = Codec.either(Codec.FLOAT, ki.L.q().dispatch(bmg::c, bmh::codec));
   public static final Codec<bmg> c = a.xmap(
      $$0 -> (bmg)$$0.map(bme::a, $$0x -> $$0x), $$0 -> $$0.c() == bmh.a ? Either.left(((bme)$$0).d()) : Either.right($$0)
   );

   public static Codec<bmg> a(float $$0, float $$1) {
      return awe.b(c, (Function<bmg, DataResult<bmg>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bmh<?> c();
}
