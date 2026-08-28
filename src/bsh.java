import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bsh implements bsm {
   private static final Codec<Either<Float, bsh>> a = Codec.either(Codec.FLOAT, ma.J.q().dispatch(bsh::c, bsi::codec));
   public static final Codec<bsh> c = a.xmap(
      $$0 -> (bsh)$$0.map(bsf::a, $$0x -> $$0x), $$0 -> $$0.c() == bsi.a ? Either.left(((bsf)$$0).d()) : Either.right($$0)
   );

   public static Codec<bsh> a(float $$0, float $$1) {
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

   public abstract bsi<?> c();
}
