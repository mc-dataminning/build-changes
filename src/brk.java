import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class brk implements brp {
   private static final Codec<Either<Float, brk>> a = Codec.either(Codec.FLOAT, lz.J.q().dispatch(brk::c, brl::codec));
   public static final Codec<brk> c = a.xmap(
      $$0 -> (brk)$$0.map(bri::a, $$0x -> $$0x), $$0 -> $$0.c() == brl.a ? Either.left(((bri)$$0).d()) : Either.right($$0)
   );

   public static Codec<brk> a(float $$0, float $$1) {
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

   public abstract brl<?> c();
}
