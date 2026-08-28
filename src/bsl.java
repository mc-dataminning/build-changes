import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bsl implements bsq {
   private static final Codec<Either<Float, bsl>> a = Codec.either(Codec.FLOAT, ma.J.q().dispatch(bsl::c, bsm::codec));
   public static final Codec<bsl> c = a.xmap(
      $$0 -> (bsl)$$0.map(bsj::a, $$0x -> $$0x), $$0 -> $$0.c() == bsm.a ? Either.left(((bsj)$$0).d()) : Either.right($$0)
   );

   public static Codec<bsl> a(float $$0, float $$1) {
      return c.validate($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      });
   }

   public abstract float a();

   public abstract float b();

   public abstract bsm<?> c();
}
