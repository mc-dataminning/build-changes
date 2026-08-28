import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpw implements bqb {
   private static final Codec<Either<Float, bpw>> a = Codec.either(Codec.FLOAT, lp.L.q().dispatch(bpw::c, bpx::codec));
   public static final Codec<bpw> c = a.xmap(
      $$0 -> (bpw)$$0.map(bpu::a, $$0x -> $$0x), $$0 -> $$0.c() == bpx.a ? Either.left(((bpu)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpw> a(float $$0, float $$1) {
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

   public abstract bpx<?> c();
}
