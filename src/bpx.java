import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bpx implements bqc {
   private static final Codec<Either<Float, bpx>> a = Codec.either(Codec.FLOAT, lp.L.q().dispatch(bpx::c, bpy::codec));
   public static final Codec<bpx> c = a.xmap(
      $$0 -> (bpx)$$0.map(bpv::a, $$0x -> $$0x), $$0 -> $$0.c() == bpy.a ? Either.left(((bpv)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpx> a(float $$0, float $$1) {
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

   public abstract bpy<?> c();
}
