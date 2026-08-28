import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpk implements bpp {
   private static final Codec<Either<Float, bpk>> a = Codec.either(Codec.FLOAT, lq.J.r().dispatch(bpk::c, bpl::codec));
   public static final Codec<bpk> c = a.xmap(
      $$0 -> (bpk)$$0.map(bpi::a, $$0x -> $$0x), $$0 -> $$0.c() == bpl.a ? Either.left(((bpi)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpk> a(float $$0, float $$1) {
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

   public abstract bpl<?> c();
}
