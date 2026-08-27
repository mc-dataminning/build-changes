import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bmf implements bmk {
   private static final Codec<Either<Float, bmf>> a = Codec.either(Codec.FLOAT, ki.L.q().dispatch(bmf::c, bmg::codec));
   public static final Codec<bmf> c = a.xmap(
      $$0 -> (bmf)$$0.map(bmd::a, $$0x -> $$0x), $$0 -> $$0.c() == bmg.a ? Either.left(((bmd)$$0).d()) : Either.right($$0)
   );

   public static Codec<bmf> a(float $$0, float $$1) {
      return awe.b(c, (Function<bmf, DataResult<bmf>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bmg<?> c();
}
