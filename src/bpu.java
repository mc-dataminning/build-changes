import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpu implements bpz {
   private static final Codec<Either<Float, bpu>> a = Codec.either(Codec.FLOAT, lt.J.r().dispatch(bpu::c, bpv::codec));
   public static final Codec<bpu> c = a.xmap(
      $$0 -> (bpu)$$0.map(bps::a, $$0x -> $$0x), $$0 -> $$0.c() == bpv.a ? Either.left(((bps)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpu> a(float $$0, float $$1) {
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

   public abstract bpv<?> c();
}
